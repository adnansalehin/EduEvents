package models;

import lombok.Data;

import java.util.HashSet;

@Data
public class Event {
	private int eventID;
	private String name;
	private String address;
	private int noOfSold;
	private String description;
	private double price;
	private HashSet<User> blacklist;
	private HashSet<User> whitelist;
	private HashSet<User> waitlist;
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
}
