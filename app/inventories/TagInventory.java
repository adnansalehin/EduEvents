package controllers;

import models.Tag;
import java.util.*;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;

public class TagInventory extends Controller {
	private TagInventory inventory = new TagInventory();
	private HashSet<Tag> tags = new HashSet<>();

	private TagInventory(){}
	public TagInventory getInstance()
	{
		return inventory;
	}
	public Result getTags() {
		JsonNode jsonNode = Json.toJson(tags);
		return ok(jsonNode).as("application/json");
	}

	public Result removeTag(String tag)
	{
		for(Tag x : tags)
			if(x.getTagName().equals(tag))
				tags.remove(x);
		return ok().as("application/json");
	}

	public Result addTag(String tagN, String tagD)
	{
		tags.add(new Tag(tagN, tagD));
		return ok().as("application/json");
	}

	public Result editTag(String oldN, String oldD, String newN, String newD)
	{
		for(Tag x : tags)
			if(x.getTagName().equals(oldN))
			{
				x.setTagName(newN);
				x.setTagDescription(newD);
			}
		return ok().as("application/json");
	}

	public Result searchTag(String tag)
	{
		HashSet<Tag> result = new HashSet<Tag>();
		for(Tag x : tags)
			if(x.getTagName().contains(tag))
				result.add(x);
		JsonNode jsonNode = Json.toJson(result);
		return ok(jsonNode).as("application/json");
	}

	public Result setTags(HashSet<Tag> tags) {
		this.tags = tags;
		return ok().as("application/json");
	}

}
