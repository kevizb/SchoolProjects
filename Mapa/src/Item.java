
public class Item {

	private String jmeno;
	private String popis;
	private ItemType typ;

	public String getJmeno() {
		return jmeno;
	}

	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	public String getPopis() {
		return popis;
	}

	public void setPopis(String popis) {
		this.popis = popis;
	}

	public Item(String jmeno, String popis) {
		super();
		this.jmeno = jmeno;
		this.popis = popis;
	}

	public ItemType getTyp() {
		return typ;
	}

	public void setTyp(ItemType typ) {
		this.typ = typ;
	}

	@Override
	public String toString() {
		return "Pøedmìt: " + jmeno + ", " + popis + "\n";
	}

}
