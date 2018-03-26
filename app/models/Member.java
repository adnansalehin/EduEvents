package models;
import java.util.*;

import play.data.validation.Constraints;

public class Member {
	private int userID;
	private String username;
	private String password;
	private String email;
	private HashSet<Event> booked;
	private boolean banned;


	public Member(String username, String password, String email) {
		this.userID = username.hashCode();
		this.username = username;
		this.email = email;
		this.password = password;
		this.banned = false;
		this.booked = new HashSet<Event>();
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
	* Returns value of booked
	* @return
	*/
	public HashSet<Event> getBooked() {
		return booked;
	}

	/**
	* Sets new value of booked
	* @param
	*/
	public void setBooked(HashSet<Event> booked) {
		this.booked = booked;
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
}
