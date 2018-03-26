package controllers;

import models.Tag;
import java.util.*;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;

public class TagInventory extends Controller {
	private static TagInventory inventory = new TagInventory();
	private HashSet<Tag> tags = new HashSet<>();

	private TagInventory(){
		addTag("python","It is about python");
		addTag("java", "It is about java");
		addTag("se","it is about software engineering");
	}
	public static TagInventory getInstance()
	{
		return inventory;
	}
	public HashSet<Tag> getTags() {
		return tags;
	}

	public void removeTag(String tag)
	{
		for(Tag x : tags)
			if(x.getTagName().equals(tag))
				tags.remove(x);
	}

	public void addTag(String tagN, String tagD)
	{
		tags.add(new Tag(tagN, tagD));
	}

	public void editTag(String oldN, String oldD, String newN, String newD)
	{
		for(Tag x : tags)
			if(x.getTagName().equals(oldN))
			{
				x.setTagName(newN);
				x.setTagDescription(newD);
			}
	}

	public HashSet<Tag> searchTag(String tag)
	{
		HashSet<Tag> result = new HashSet<Tag>();
		for(Tag x : tags)
			if(x.getTagName().contains(tag))
				result.add(x);

			return result;
	}

	public void setTags(HashSet<Tag> tags) {
		this.tags = tags;
	}

}
