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
		switch (nazev) {
		case "Les":
			NPC lesNpc = new NPC("Liška", "hladové mládì lišky");
			Item lesItem = new Item("Sekera", "trošku opotøebená, ale dá se s ní pracovat");
			
			return nazev + lesNpc.toString() + lesItem.toString();

		case "Bazina":
			NPC bazinaNpc = new NPC("Uschlý strom", "smutný uschlý strom (mìní se na uhlí)");
			Item bazinaItem = new Item("Meè", "Meè padlého vojáka, co se utopil zde utopil");
			
			return nazev + bazinaNpc.toString() + bazinaItem.toString();

		case "Hrad":
			NPC hradNpc = new NPC("Anièka", "Drží v ruce koštì a zametá");
			Item hradItem = new Item("Brnìní", "bojové brnìní první tøídy, urèeno pro krále");
			
			return nazev + hradNpc.toString() + hradItem.toString();
			
		case "Ves":
			NPC vesNpc = new NPC("Maøena", "hospodská v místní krèmì (dává slevu na klobásku)");
			Item vesItem = new Item("Korbel", "pohozený korbel od piva... asi ho tu nìkdo nechal");
			
			return nazev + vesNpc.toString() + vesItem.toString();
			
		case "Louka":
			NPC loukaNpc = new NPC("Motýl", "krásný pestroberevný motýlek");
			Item loukaItem = new Item("Vidle", "zapomenuté vidle");
			
			return nazev + loukaNpc.toString() + loukaItem.toString();
			
		case "Jezero":
			NPC jezeroNpc = new NPC("Vodník Karel", "karel je zdejší vodník co si schovává dušièky pod kamenem (neznámé místo)");
			Item jezeroItem = new Item("Rybáøský prut", "prut, kterým se loví ryby.");
			
			return nazev + jezeroNpc.toString() + jezeroItem.toString();
			
		case "Hory":
			NPC horyNpc = new NPC("Baèa", "má pár oveèek a zná spoustu baèovských vtipù");
			Item horyItem = new Item("Nic", "prázdno");
			
			return nazev + horyNpc.toString() + horyItem;
		}
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