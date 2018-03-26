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

		return ok("return: "+loginSuccessful).as("application/json");
	}

	public Result signUp(String username, String password, String email) {
		boolean signUpSuccessful = false;
		this.user.username = username;
		this.user.password = password;
		this.user.email = email;

		signUpSuccessful = userInventory.getUserInventory().add(user);

		return ok("return: "+signUpSuccessful).as("application/json");
	}



		//Test method
	public Result testLogin(){

		return ok(username + "-" + password).as("application/json");

	}
}
