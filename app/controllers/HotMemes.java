package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;

public class HotMemes extends Controller {

    public Result appSummary() {
        JsonNode jsonNode = Json.toJson(new AppSummary("Java Play React Seed"));
        return ok(jsonNode).as("application/json");
    }
}
