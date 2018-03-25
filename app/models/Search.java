package models;

import lombok.Data;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;
import java.util.*;
import java.util.HashSet;
import inventories.EventInventory;
import models.Event;
import models.Tag;
import models.Event;

@Data
public class Search extends Controller {
  private String term;
  private HashSet<Tag> tags;
  private String searchMethodState;
  private String sortMethodState;
  private EventInventory events;

	public Search()
  {
  }


  public Result results(String term, String tags, String address, String organiser)
  {
    events = new EventInventory();
    events.setEvents(new HashSet<Event>());
    events.createEvent("something","else","idk","lul",20.01,20);
    events.createEvent("asd","elda2dse","ia2d2ddk","lua2d2adl",20.01,20);
    events.createEvent("ve2a2v","va2v2a","va2v2ava2","va2v2av2",20.01,20);

    HashSet<Event> inventory = events.getEvents();
    HashSet<Event> filtered = new HashSet<Event>();
    for(Event e : inventory)
    {
      if(e.getName().contains(term) || e.getDescription().contains(term))
        filtered.add(e);
      if(e.getAddress().contains(address))
        filtered.add(e);
      if(e.getOrganiser().contains(organiser))
        filtered.add(e);
    }
    JsonNode jsonNode = Json.toJson(filtered);
    return ok(jsonNode).as("application/json");
  }

	/**
	* Returns value of term
	* @return
	*/
	public String getTerm() {
		return term;
	}

	/**
	* Sets new value of term
	* @param
	*/
	public void setTerm(String term) {
		this.term = term;
	}

	/**
	* Returns value of tags
	* @return
	*/
	public HashSet<Tag> getTags() {
		return tags;
	}

	/**
	* Sets new value of tags
	* @param
	*/
	public void setTags(HashSet<Tag> tags) {
		this.tags = tags;
	}

	/**
	* Returns value of searchMethodState
	* @return
	*/
	public String getSearchMethodState() {
		return searchMethodState;
	}

	/**
	* Sets new value of searchMethodState
	* @param
	*/
	public void setSearchMethodState(String searchMethodState) {
		this.searchMethodState = searchMethodState;
	}

	/**
	* Returns value of sortMethodState
	* @return
	*/
	public String getSortMethodState() {
		return sortMethodState;
	}

	/**
	* Sets new value of sortMethodState
	* @param
	*/
	public void setSortMethodState(String sortMethodState) {
		this.sortMethodState = sortMethodState;
	}

	/**
	* Returns value of events
	* @return
	*/
	public EventInventory getEvents() {
		return events;
	}

	/**
	* Sets new value of events
	* @param
	*/
	public void setEvents(EventInventory events) {
		this.events = events;
	}
}
