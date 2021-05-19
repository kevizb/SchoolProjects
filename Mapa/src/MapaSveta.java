import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

public class MapaSveta extends HashMap<Integer, Lokalita> implements Serializable {
	private int zacatek = 8;
	private int aktualniPoloha = zacatek;

	
	//na�te mapu ze souboru
	public static MapaSveta nacti(String nazevSouboru) throws IOException {
		MapaSveta mapa = new MapaSveta();
		try (BufferedReader reader = new BufferedReader(new FileReader(nazevSouboru))) {
			String radek = "";
			while ((radek = reader.readLine()) != null) {
				String[] pole = radek.split(";");
				Lokalita lokalita = new Lokalita(pole[1], Integer.parseInt(pole[0]));
				for (int i = 0; i < 4; i++) {
					lokalita.pripojLokalitu(i, Integer.parseInt(pole[i + 2]));
				}
				mapa.put(lokalita.getId(), lokalita);
			}
		}
		return mapa;
	}

	//vyp�e n�zev aktu�ln� polohy
	public String nazevAktualniPolohy() {
		return this.get(aktualniPoloha).toString();
	}

	//nastav� novou aktu�ln� polohu -> p�esune do lokality podle sm�ru
	public boolean jdiNa(int smer) {
		int idKam = this.get(aktualniPoloha).getSmer(smer);
		if (idKam == -1) {
			return false;
		}

		aktualniPoloha = idKam;
		return true;
	}

}
