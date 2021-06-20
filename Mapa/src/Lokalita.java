import java.io.Serializable;

public class Lokalita implements Serializable {

	// n�zev lokality
	private String nazev;

	// ID lokality
	private int id;

	// sm�ry kam m��e hr�� j�t (sever - 0, v�chod - 1, jih - 2, z�pad - 3)
	int[] smery = new int[4];

	// metoda pro vytvo�en� lokality
	public Lokalita(String nazev, int id) {
		this.nazev = nazev;
		this.id = id;
	}

	//
	public void pripojLokalitu(int smer, int kam) {
		smery[smer] = kam;
	}

	// vyp�e n�zev lokality
	public String toString() {
		return nazev;
	}
	

	// vrac� ID lokality
	public int getId() {
		return id;
	}

	// nastav� ID lokality
	public void setId(int id) {
		this.id = id;
	}

	// vrac� sm�r (0, 1, 2, 3)
	public int getSmer(int smer) {
		return smery[smer];
	}
}