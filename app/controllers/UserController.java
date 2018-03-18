package controllers;

import inventories.UserInventory;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

import static play.libs.Scala.asScala;

public class UserController extends Controller{
	private final Form<User> form;
	private User user;
	@Inject
	UserInventory userInventory;

	public UserController(FormFactory formFactory, User user) {
		this.form = formFactory.form(User.class);
		this.user = user;
	}
	public String getUsername() {
		return this.user.getUsername();
	}

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
