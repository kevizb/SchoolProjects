import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	
	public static void main(String[] args) {
				try {
					MapaSveta mapa = MapaSveta.nacti("mapa.csv");
					System.out.println("M�sto: "+mapa.nazevAktualniPolohy());
					if(!mapa.jdiNa(3)) {
						System.out.println("Nelze");
					}
					System.out.println("M�sto: "+mapa.nazevAktualniPolohy());
					if(!mapa.jdiNa(3)) {
						System.out.println("Nelze");
					}
					System.out.println("M�sto: "+mapa.nazevAktualniPolohy());
					if(!mapa.jdiNa(0)) {
						System.out.println("Nelze");
					}
					System.out.println("M�sto: "+mapa.nazevAktualniPolohy());
					if(!mapa.jdiNa(1)) {
						System.out.println("Nelze");
					}
					System.out.println("Misto: "+mapa.nazevAktualniPolohy());
				} catch(FileNotFoundException e) {
					System.out.println("Soubor s mapou nenalezen.");
				} catch (IOException ex) {
					System.out.println("Nastal probl�m p�i �ten� dat ze souboru.");
				} catch (Exception ex) {
					System.out.println("Data v souboru nep�estavuj� mapu sv�ta.");
					System.out.print("-> probl�m s daty / k�dem");
					
				}

	}

}
