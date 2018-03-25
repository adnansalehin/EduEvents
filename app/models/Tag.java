package models;

import lombok.Data;

import java.util.HashSet;

@Data
public class Tag {
	private String tagName;
  private String tagDescription;


	public Tag(String tagName, String tagDescription) {
		this.tagName = tagName;
    this.tagDescription = tagDescription;
	}
}
