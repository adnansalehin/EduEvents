package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import models.Member;
import inventories.MemberInventory;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.*;

//import javax.inject.Inject;

//import static play.libs.Scala.asScala;

public class MemberController extends Controller{

	//Test variables can be deleted
	private String username;
	private String password;
	private Member model;

	public MemberController(Member model)
	{
		this.model = model;
	}

	public Result login(String username, String password){

		//Username and password passed as /login/username/password
		//Verify against stored data
		//Return should be based on evaluating whether username/password combination is valid

		//Testing that values are passed.
		this.username = username;
		this.password = password;

		//After submitting login details on sign in page go to:
		//localhost:9000/testLogin to see that variables have been assigned to class variables and then output on that url through method testLogin()

		//Later verification can be done in a single method (for example this one) and return success or failure

		//Temporary return
		return ok();

	}

	//Test method
	public Result testLogin(){

		return ok(username + "-" + password).as("application/json");

	}



	//private final Form<User> form;
	//private User user;
	//@Inject
	//UserInventory userInventory;

	//public UserController(FormFactory formFactory, User user) {
		//this.form = formFactory.form(User.class);
		//this.user = user;
	//}
	//public String getUsername() {
		//return this.user.getUsername();
	//}

	/**
	 * Attempt at receiving data and updating views
	 */
//	public Result index() {
//		return ok(views.html.index.render());
//	}
//
//	public Result listWidgets() {
//		return ok(views.html.listWidgets.render(asScala(user), form));
//	}
//
//	public Result createWidget() {
//		final Form<User> boundForm = form.bindFromRequest();
//
//		if (boundForm.hasErrors()) {
//			play.Logger.ALogger logger = play.Logger.of(getClass());
//			logger.error("errors = {}", boundForm.errors());
//			return badRequest(views.html.listWidgets.render(asScala(widgets), boundForm));
//		} else {
//			WidgetData data = boundForm.get();
//			widgets.add(new Widget(data.getName(), data.getPrice()));
//			flash("info", "Widget added!");
//			return redirect(routes.WidgetController.listWidgets());
//		}
//	}
}
