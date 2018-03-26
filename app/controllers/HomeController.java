package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;
import java.util.*;

class AppSummary {
    private String content;
    private String memes;

    AppSummary(String content, String memes) {
        this.content = content;
        this.memes = memes;
    }

    public String getContent() {
        return content;
    }

    public String getMemes()
    {
      return memes;
    }

    public void setMemes(String memes)
    {
      this.memes = memes;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

public class HomeController extends Controller {

    public Result appSummary() {
        JsonNode jsonNode = Json.toJson(new AppSummary("Java Play React Seed","hehehe"));
        return ok(jsonNode).as("application/json");
    }

    public Result memes(String s) {
        System.out.println(s);
        JsonNode jsonNode = Json.toJson(new AppSummary(s,s));
        return ok(jsonNode).as("application/json");
    }

}
