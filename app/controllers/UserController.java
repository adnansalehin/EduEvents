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
    private TagInventory tagInventory = TagInventory.getInstance();
	public UserController() {
    signUp("user","user","user@user.user");
    signUp("hot","memes","@lul");
    signUp("organiser","organiser","organiser@organiser.organiser");
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
    System.out.println(loginSuccessful);
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

  public Result search(String term, String tags)
  {
    String[] ar = tags.split(" ");
    HashSet<Tag> tagSet = tagInventory.getTags();
    HashSet<User> userInv = userInventory.getUsers();
    HashSet<Tag> tagRes = new HashSet<Tag>();
    for(String s : ar)
      for(Tag t : tagSet)
        if(t.getTagName().equals(s))
          tagRes.add(t);
    HashSet<Event> events = eventInventory.getEvents();
    HashSet<Event> filtered = new HashSet<Event>();
    for(Event e : events)
    {
      if(e.getName().contains(term) || e.getDescription().contains(term) || e.getAddress().contains(term))
        filtered.add(e);
      for(Tag t : e.getTags())
        for(Tag l : tagRes)
          if(t.equals(l))
            filtered.add(e);
    }
    JsonNode jsonNode = Json.toJson(filtered);
    return ok(jsonNode).as("application/json");
  }

  public Result getModel()
  {
    JsonNode jsonNode = Json.toJson(model);
    return ok(jsonNode).as("application/json");
  }

  public Result setModel(String username)
  {
    HashSet<User> users = userInventory.getUsers();
    for(User x : users)
      if(x.getUsername().equals(username))
        this.model = x;
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
