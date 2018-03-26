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

public class UserController extends Controller {

    private User model;
    private UserInventory userInventory = UserInventory.getInstance();
    private EventInventory eventInventory = EventInventory.getInstance();
	public UserController() {

	}

	public Result login(String username, String password) {
		boolean loginSuccessful = false;
    HashSet<User> users = userInventory.getUsers();
    ArrayList meme = new ArrayList();
    User login = new User();

    for(User x : users)
      if(x.getUsername().equals(username) && x.getPassword().equals(password))
      {
        loginSuccessful = true;
        login = x;
      }
      else
        loginSuccessful = false;
    this.model = login;
    JsonNode jsonNode = Json.toJson(loginSuccessful);
    return ok(jsonNode).as("application/json");
	}

	public Result signUp(String username, String password, String email) {
    boolean success = true;
    HashSet<User> users = userInventory.getUsers();
    for(User x : users)
      if(x.getUsername().equals(username) || x.getEmail().equals(email))
      {
        success = false;
      }
		userInventory.addUser(new User(username, password, email));
    System.out.println(userInventory.getUsers());
    JsonNode jsonNode = Json.toJson(success);
    return ok(jsonNode).as("application/json");
	}

  public Result getModel()
  {
    JsonNode jsonNode = Json.toJson(model);
    return ok(jsonNode).as("application/json");
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
