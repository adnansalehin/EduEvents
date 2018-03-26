package models;
import java.util.HashSet;

public class Tag {
	private String tagName;
  private String tagDescription;


	public Tag(String tagName, String tagDescription) {
		this.tagName = tagName;
    this.tagDescription = tagDescription;
	}

	/**
	* Returns value of tagName
	* @return
	*/
	public String getTagName() {
		return tagName;
	}

	/**
	* Sets new value of tagName
	* @param
	*/
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	/**
	* Returns value of tagDescription
	* @return
	*/
	public String getTagDescription() {
		return tagDescription;
	}

	/**
	* Sets new value of tagDescription
	* @param
	*/
	public void setTagDescription(String tagDescription) {
		this.tagDescription = tagDescription;
	}
}
