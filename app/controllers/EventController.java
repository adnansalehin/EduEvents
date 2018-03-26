package controllers;

import models.*;
import inventories.*;

import java.util.*;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;
import java.util.HashSet;

public class EventController extends Controller {
  private Event event;
  private EventInventory eventInventory = EventInventory.getInstance();
  private UserInventory userInventory = UserInventory.getInstance();
  private TagInventory tagInventory = TagInventory.getInstance();
  private ReportInventory reportInventory = ReportInventory.getInstance();
	public EventController(Event event) {
    this.event = event;
    createEvent("Python course","Somewhere at","Best python course ever",399.00,420,"python","organiser");
    createEvent("Java course","Somewhere at","Best Java course ever",10.00,420,"java","user");

	}

  public Result createEvent(String name, String address, String description, double price, int maxTickets, String tags, String username){
    boolean result = true;
    HashSet<Event> eventInv = eventInventory.getEvents();
    for(Event x : eventInv)
      if(x.getName().equals(name))
        result = false;
    if(result) {
      String[] ar = tags.split(" ");
      HashSet<Tag> tagSet = tagInventory.getTags();
      HashSet<User> userInv = userInventory.getUsers();
      HashSet<Tag> tagRes = new HashSet<Tag>();
      for(String s : ar)
        for(Tag t : tagSet)
          if(t.getTagName().equals(s))
            tagRes.add(t);
      Event newEvent = new Event(name,address,description,price,maxTickets,tagRes);
  		eventInventory.createEvent(newEvent);
      for(User u : userInv)
        if(u.getUsername().equals(username))
          u.addCreated(newEvent);
    }
    JsonNode jsonNode = Json.toJson(result);
    return ok(jsonNode).as("application/json");
	}

  public Result getEvents()
  {
    JsonNode jsonNode = Json.toJson(eventInventory.getEvents());
    return ok(jsonNode).as("application/json");
  }

  public Result deleteEvent(String eventname)
  {
    boolean result = false;
    HashSet<Event> eventInv = eventInventory.getEvents();
    for(Event e : eventInv)
      if(e.getName().equals(eventname))
      {
        result = true;
        eventInv.remove(e);
      }
    JsonNode jsonNode = Json.toJson(result);
    return ok(jsonNode).as("application/json");
  }

	public Result isFullyBooked() {
		boolean result = event.isFullyBooked();
    JsonNode jsonNode = Json.toJson(result);
    return ok(jsonNode).as("application/json");
	}
}
