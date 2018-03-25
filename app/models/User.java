package models;

import lombok.Data;
import play.data.validation.Constraints;

@Data
public class User {
	int userID;
	String username;
	@Constraints.MinLength(8)
	String password;
	@Constraints.Email
	String email;
	boolean banned;
	public User(String username, String password, String email) {
		this.userID = username.hashCode();
		this.username = username;
		this.password = password;
		this.email = email;
		this.banned = false;
	}
}