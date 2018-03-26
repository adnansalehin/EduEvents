package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.*;
import inventories.*;
import java.util.*;
import play.libs.Json;
import inventories.UserInventory;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.*;
import inventories.UserInventory.*;
//import javax.inject.Inject;

//import static play.libs.Scala.asScala;

public class UserController extends Controller {

    private User model;
    private UserInventory userInventory = UserInventory.getInstance();
    private EventInventory eventInventory = EventInventory.getInstance();
	public UserController() {

	}

	//Test variables can be deleted
//	private String username;
//	private String password;


	public Result login(String username, String password) {
		boolean loginSuccessful = false;
		model.setUsername(username);
    model.setPassword(password);

        if(userInventory.isRegistered(model))
        	loginSuccessful = true;
        else
        	loginSuccessful = false;

		return ok("return: "+loginSuccessful).as("application/json");
	}

	public Result signUp(String username, String password, String email) {
		userInventory.addUser(new User(username, password, email));
    System.out.println(userInventory.getUsers());
		return ok().as("application/json");
	}

  public Result bookEvent(int eventID,int noOfTickets, double price)
  {
    Event result = eventInventory.getEventById(eventID);
    Date date = new Date();
    if(result.getNoOfSold()+noOfTickets > result.getMaxTickets())
      result = null;
    else
      result.bookTicket(noOfTickets);
    model.addTicket(new Ticket(date.toString(),price));
    JsonNode jsonNode = Json.toJson(result);
    return ok(jsonNode).as("application/json");
  }
}
