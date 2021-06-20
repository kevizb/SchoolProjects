import java.io.Serializable;

public class Lokalita implements Serializable {

	// název lokality
	private String nazev;

	// ID lokality
	private int id;

	// smìry kam mùže hráè jít (sever - 0, východ - 1, jih - 2, západ - 3)
	int[] smery = new int[4];

	// metoda pro vytvoøení lokality
	public Lokalita(String nazev, int id) {
		this.nazev = nazev;
		this.id = id;
	}

	//
	public void pripojLokalitu(int smer, int kam) {
		smery[smer] = kam;
	}

	// vypíše název lokality
	public String toString() {
		return nazev;
	}
	

	// vrací ID lokality
	public int getId() {
		return id;
	}

	// nastaví ID lokality
	public void setId(int id) {
		this.id = id;
	}

	// vrací smìr (0, 1, 2, 3)
	public int getSmer(int smer) {
		return smery[smer];
	}
}