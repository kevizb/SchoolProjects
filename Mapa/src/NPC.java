
public class NPC {

	private String jmeno = "Karel";

	private String popis = "prostý chudák";

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

	public NPC(String jmeno, String popis) {
		super();
		this.jmeno = jmeno;
		this.popis = popis;
	}

	@Override
	public String toString() {
		return ",\nNPC: " + jmeno + ", " + popis + "\n";
	}

}
