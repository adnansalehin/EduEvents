package inventories;

import lombok.Data;
import models.Tag;
import java.util.Collection;
import java.util.HashSet;

@Data
public class TagInventory {
	private Collection<Tag> tags = new HashSet<>();
	{

	}
}
