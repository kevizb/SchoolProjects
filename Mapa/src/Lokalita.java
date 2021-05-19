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
		switch (nazev) {
		case "Les":
			NPC lesNpc = new NPC("Li�ka", "hladov� ml�d� li�ky");
			Item lesItem = new Item("Sekera", "tro�ku opot�eben�, ale d� se s n� pracovat");
			
			return nazev + lesNpc.toString() + lesItem.toString();

		case "Bazina":
			NPC bazinaNpc = new NPC("Uschl� strom", "smutn� uschl� strom (m�n� se na uhl�)");
			Item bazinaItem = new Item("Me�", "Me� padl�ho voj�ka, co se utopil zde utopil");
			
			return nazev + bazinaNpc.toString() + bazinaItem.toString();

		case "Hrad":
			NPC hradNpc = new NPC("Ani�ka", "Dr�� v ruce ko�t� a zamet�");
			Item hradItem = new Item("Brn�n�", "bojov� brn�n� prvn� t��dy, ur�eno pro kr�le");
			
			return nazev + hradNpc.toString() + hradItem.toString();
			
		case "Ves":
			NPC vesNpc = new NPC("Ma�ena", "hospodsk� v m�stn� kr�m� (d�v� slevu na klob�sku)");
			Item vesItem = new Item("Korbel", "pohozen� korbel od piva... asi ho tu n�kdo nechal");
			
			return nazev + vesNpc.toString() + vesItem.toString();
			
		case "Louka":
			NPC loukaNpc = new NPC("Mot�l", "kr�sn� pestroberevn� mot�lek");
			Item loukaItem = new Item("Vidle", "zapomenut� vidle");
			
			return nazev + loukaNpc.toString() + loukaItem.toString();
			
		case "Jezero":
			NPC jezeroNpc = new NPC("Vodn�k Karel", "karel je zdej�� vodn�k co si schov�v� du�i�ky pod kamenem (nezn�m� m�sto)");
			Item jezeroItem = new Item("Ryb��sk� prut", "prut, kter�m se lov� ryby.");
			
			return nazev + jezeroNpc.toString() + jezeroItem.toString();
			
		case "Hory":
			NPC horyNpc = new NPC("Ba�a", "m� p�r ove�ek a zn� spoustu ba�ovsk�ch vtip�");
			Item horyItem = new Item("Nic", "pr�zdno");
			
			return nazev + horyNpc.toString() + horyItem;
		}
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