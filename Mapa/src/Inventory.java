import java.util.HashMap;

public class Inventory {
	private HashMap<ItemType, Item> inventory = new HashMap<>();

	public Inventory() {
		inventory.put(ItemType.Lektvar, null);
		inventory.put(ItemType.Jídlo, null);
	}

	public Item add(Item item) {
		return inventory.put(item.getTyp(), item);
	}

	public Item inEquipment(ItemType type) {
		return inventory.get(type);
	}

	@Override
	public String toString() {
		String vypis = "Inventáø:\n";
		for (ItemType type : inventory.keySet()) {
			vypis += type.printItemType() + ": " + inventory.get(type).toString() + "\n";
		}
		return vypis;
	}
}
