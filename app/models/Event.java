package models;

import java.util.HashSet;

public class Event {
	private int eventID;
	private String name;
	private HashSet<Tag> tags;
	private String address;
	private int noOfSold;
	private String description;
	private double price;
	private HashSet<Member> blacklist;
	private HashSet<Member> whitelist;
	private HashSet<Member> waitlist;
	private int maxTickets;



	public Event(String name, String address, String description, double price, int maxTickets) {
		this.eventID = name.hashCode();
		this.name = name;
		this.address = address;
		this.description = description;
		this.price = price;
		this.maxTickets = maxTickets;
		this.noOfSold = 0;
	}



	public boolean isFullyBooked() {
		if(this.noOfSold<this.maxTickets)
			return true;
		else
			return false;
	}

	/**
	* Returns value of eventID
	* @return
	*/
	public int getEventID() {
		return eventID;
	}

	/**
	* Sets new value of eventID
	* @param
	*/
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}

	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**
	* Returns value of tags
	* @return
	*/
	public HashSet<Tag> getTags() {
		return tags;
	}

	/**
	* Sets new value of tags
	* @param
	*/
	public void setTags(HashSet<Tag> tags) {
		this.tags = tags;
	}

	/**
	* Returns value of address
	* @return
	*/
	public String getAddress() {
		return address;
	}

	/**
	* Sets new value of address
	* @param
	*/
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	* Returns value of noOfSold
	* @return
	*/
	public int getNoOfSold() {
		return noOfSold;
	}

	/**
	* Sets new value of noOfSold
	* @param
	*/
	public void setNoOfSold(int noOfSold) {
		this.noOfSold = noOfSold;
	}

	/**
	* Returns value of description
	* @return
	*/
	public String getDescription() {
		return description;
	}

	/**
	* Sets new value of description
	* @param
	*/
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	* Returns value of price
	* @return
	*/
	public double getPrice() {
		return price;
	}

	/**
	* Sets new value of price
	* @param
	*/
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	* Returns value of blacklist
	* @return
	*/
	public HashSet<Member> getBlacklist() {
		return blacklist;
	}

	/**
	* Sets new value of blacklist
	* @param
	*/
	public void setBlacklist(HashSet<Member> blacklist) {
		this.blacklist = blacklist;
	}

	/**
	* Returns value of whitelist
	* @return
	*/
	public HashSet<Member> getWhitelist() {
		return whitelist;
	}

	/**
	* Sets new value of whitelist
	* @param
	*/
	public void setWhitelist(HashSet<Member> whitelist) {
		this.whitelist = whitelist;
	}

	/**
	* Returns value of waitlist
	* @return
	*/
	public HashSet<Member> getWaitlist() {
		return waitlist;
	}

	/**
	* Sets new value of waitlist
	* @param
	*/
	public void setWaitlist(HashSet<Member> waitlist) {
		this.waitlist = waitlist;
	}

	/**
	* Returns value of maxTickets
	* @return
	*/
	public int getMaxTickets() {
		return maxTickets;
	}

	/**
	* Sets new value of maxTickets
	* @param
	*/
	public void setMaxTickets(int maxTickets) {
		this.maxTickets = maxTickets;
	}
}
