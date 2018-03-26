package inventories;

import models.Member;
import models.Event;
import java.util.Collection;
import java.util.HashSet;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;
import java.util.*;

public class EventInventory extends Controller {
	private HashSet<Event> events = new HashSet<Event>();
	public EventInventory()
	{	}

	public Result getEvents() {
		return ok();
	}

	public void setEvents(HashSet<Event> events) {
		this.events = events;
	}

	public Result createEvent(String name, String address, String description, double price, int maxTickets, String tags, String blacklist, String whitelist){

		return ok();
	}

	public Result deleteEvent(Event event)
	{
		if(events.remove(event))
			return ok();
		return ok();
	}
}
