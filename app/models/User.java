package models;

import lombok.Data;
import play.data.validation.Constraints;

import java.util.Collection;

@Data
public class User {
	int userID;
	String username;
	@Constraints.MinLength(8)
	String password;
	@Constraints.Email
	String email;
	boolean banned;
	Collection<Tag> tags;
	Collection<Ticket> tickets;
	public User(String username, String password, String email) {
		this.userID = username.hashCode();
		this.username = username;
		this.password = password;
		this.email = email;
		this.banned = false;
	}
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
}