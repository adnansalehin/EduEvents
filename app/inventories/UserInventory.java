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
	private Collection<User> users = new HashSet<>();
	{
		users.add(new User("adnan", "qwerty", "adnan@abc.com"));
		users.add(new User("adnan2", "qwerty", "adnan@qwe.com"));
    }
    public boolean isRegistered(User user) {
        return (users.contains(user));
    }

    public UserInventory() {
		Connection conn = null;
	    try {
		    // db parameters
		    String url = "jdbc:sqlite:C:/Users/adnan/EduEvents/app/database\\eduevents.db";
		    // create a connection to the database
		    conn = DriverManager.getConnection(url);

		    System.out.println("Connection to SQLite has been established.");

	    } catch (SQLException e) {
		    System.out.println(e.getMessage());
	    } finally {
		    try {
			    if (conn != null) {
				    conn.close();
			    }
		    } catch (SQLException ex) {
			    System.out.println(ex.getMessage());
		    }
	    }
	}
}
