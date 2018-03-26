package inventories;

import lombok.Data;
import models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;

@Data
public class UserInventory {
	private UserInventory inventory = new UserInventory();
	private Collection<User> users = new HashSet<>();
	private UserInventory()
	{}

	public UserInventory getInstance()
	{
		return inventory;
	}

  public boolean isRegistered(User user) {
        return (users.contains(user));
  }
}
