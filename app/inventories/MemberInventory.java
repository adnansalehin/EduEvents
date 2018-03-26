package inventories;

import java.util.*;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;
import models.Member;
import java.util.Collection;
import java.util.HashSet;

public class MemberInventory extends Controller {
	private Collection<Member> users = new HashSet<Member>();
	{
		users.add(new Member("adnan", "qwerty", "adnan@fuckyou.com"));
		users.add(new Member("adnan2", "qwerty", "adnan@fuckyou.com"));
	}

	public Result register(String username, String password, String email)
	{
		users.add(new Member(username, password, email));
		return ok();
	}
	public Result login(String username, String password)
	{
		JsonNode jsonNode = Json.toJson(false);
		for(Member x : users)
			if(x.getUsername().equals(username) && x.getPassword().equals(password))
				jsonNode = Json.toJson(x);
		return ok(jsonNode).as("application/json");
	}

}
