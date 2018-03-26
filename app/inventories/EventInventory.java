package inventories;

import models.*;
import inventories.*;
import java.util.Collection;
import java.util.HashSet;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;
import java.util.*;
public class EventInventory {
	private static EventInventory inventory = new EventInventory();
	private HashSet<Event> events = new HashSet<Event>();
	private EventInventory(){}

	public static  EventInventory getInstance()
	{
		return inventory;
	}

	public HashSet<Event> getEvents() {
		return events;
	}

	public void setEvents(HashSet<Event> events) {
		this.events = events;
	}

	public void createEvent(Event event){
		events.add(event);
	}

	public Event getEventById(int id)
	{
		for(Event x : events)
			if(x.getEventID() == id)
				return x;
		return null;
	}

	public boolean deleteEvent(Event event)
	{
		if(events.remove(event))
			return true;
		return false;
	}
}
