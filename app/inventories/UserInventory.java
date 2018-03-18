package inventories;

import lombok.Data;
import models.User;
import java.util.Collection;
import java.util.HashSet;

@Data
public class UserInventory {
	private Collection<User> users = new HashSet<>();
	{
		users.add(new User("adnan", "qwerty", "adnan@fuckyou.com"));
		users.add(new User("adnan2", "qwerty", "adnan@fuckyou.com"));
	}
}
