import java.util.HashMap;

public class Equipment2 extends HashMap<ItemType, Item> {
	
	public void inicializace() {
		this.put(ItemType.Zbran, null);
		this.put(ItemType.Stit, null);
		this.put(ItemType.Odev, null);
		this.put(ItemType.Sperk, null);
	}

	@Override
	public String toString() {
		String vypis = "Výstroj:\n";
		for (ItemType type : this.keySet()) {
			vypis += type.printItemType() + ": " + this.get(type).toString() + "\n";
		}
		return vypis;
	}

}
