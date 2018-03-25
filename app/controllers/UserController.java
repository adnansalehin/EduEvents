package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.User;
import play.libs.Json;
import inventories.UserInventory;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.*;
import models.User.*;
import inventories.UserInventory.*;
//import javax.inject.Inject;

//import static play.libs.Scala.asScala;

public class UserController extends Controller {

    private User user;
    private UserInventory userInventory;
	public UserController(User user) {
		this.user = user;
	}

	//Test variables can be deleted
//	private String username;
//	private String password;


	public Result login(String username, String password) {

		boolean loginSuccessful = false;
		this.user.setUsername(username);
        this.user.setPassword(password);

        if(userInventory.isRegistered(user))
        	loginSuccessful = true;
        else
        	loginSuccessful = false;

		return ok(loginSuccessful).as("application/json");
	}
	public Result signUp(String username, String password, String email) {
		boolean signUpSuccessful = false;
		this.user.username = username;
		this.user.password = password;
		this.user.email = email;

		signUpSuccessful = userInventory.getUserInventory().add(user);

		return ok(signUpSuccessful).as("application/json");
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
