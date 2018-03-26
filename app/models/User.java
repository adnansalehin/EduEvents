package models;

import play.data.validation.Constraints;
import java.util.Collection;

public class User {
	private int userID;
	private String username;
	@Constraints.MinLength(8)
	private String password;
	@Constraints.Email
	private String email;
	private boolean banned;
	private Collection<Tag> tags;
	private Collection<Ticket> tickets;
	public User(String username, String password, String email) {
		this.userID = username.hashCode();
		this.username = username;
		this.password = password;
		this.email = email;
		this.banned = false;
	}

	public User()
	{}
	//add user's interests
	public void addTag(Tag tag) {
		tags.add(tag);
	}
	public void removeTag(Tag tag) {
		tags.remove(tag);
	}
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}


	/**
	* Returns value of userID
	* @return
	*/
	public int getUserID() {
		return userID;
	}

	/**
	* Sets new value of userID
	* @param
	*/
	public void setUserID(int userID) {
		this.userID = userID;
	}

	/**
	* Returns value of username
	* @return
	*/
	public String getUsername() {
		return username;
	}

	/**
	* Sets new value of username
	* @param
	*/
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	* Returns value of password
	* @return
	*/
	public String getPassword() {
		return password;
	}

	/**
	* Sets new value of password
	* @param
	*/
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	* Returns value of email
	* @return
	*/
	public String getEmail() {
		return email;
	}

	/**
	* Sets new value of email
	* @param
	*/
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	* Returns value of banned
	* @return
	*/
	public boolean isBanned() {
		return banned;
	}

	/**
	* Sets new value of banned
	* @param
	*/
	public void setBanned(boolean banned) {
		this.banned = banned;
	}

	/**
	* Returns value of tags
	* @return
	*/
	public Collection<Tag> getTags() {
		return tags;
	}

	/**
	* Sets new value of tags
	* @param
	*/
	public void setTags(Collection<Tag> tags) {
		this.tags = tags;
	}

	/**
	* Returns value of tickets
	* @return
	*/
	public Collection<Ticket> getTickets() {
		return tickets;
	}

	/**
	* Sets new value of tickets
	* @param
	*/
	public void setTickets(Collection<Ticket> tickets) {
		this.tickets = tickets;
	}
}
