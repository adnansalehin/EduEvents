package inventories;

import lombok.Data;
import models.User;
import models.Event;
import java.util.Collection;
import java.util.HashSet;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;
import java.util.*;

@Data
public class EventInventory {
	public EventInventory()
	{

	}
	private HashSet<Event> events = new HashSet<Event>();
	{

	}

	/**
	* Returns value of events
	* @return
	*/
	public HashSet<Event> getEvents() {
		return events;
	}

	/**
	* Sets new value of events
	* @param
	*/
	public void setEvents(HashSet<Event> events) {
		this.events = events;
	}

	public boolean createEvent(String name, String address, String description,String organiser, double price, int maxTickets){
		events.add(new Event(name, address, description, organiser, price, maxTickets));
		return true;
	}

	public boolean deleteEvent(Event event)
	{
		if(events.remove(event))
			return true;
		return false;
	}
}
