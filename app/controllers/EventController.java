package controllers;

import models.Event;
import models.Tag;

import java.util.*;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;
import java.util.HashSet;

public class EventController extends Controller {
  Event event;

	public EventController(Event event) {
    this.event = event;
	}

	public Result isFullyBooked() {
		boolean result = event.isFullyBooked();
    JsonNode jsonNode = Json.toJson(result);
    return ok(jsonNode).as("application/json");
	}
}
