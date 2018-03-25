package inventories;

import lombok.Data;
import models.User;
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
        return (users.contains(user))
    }
}
