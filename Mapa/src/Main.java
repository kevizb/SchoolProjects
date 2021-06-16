
/*
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	
	public static void main(String[] args) {
				try {
					MapaSveta mapa = MapaSveta.nacti("mapa.csv");
					System.out.println("Místo: "+mapa.nazevAktualniPolohy());
					if(!mapa.jdiNa(3)) {
						System.out.println("Nelze");
					}
					System.out.println("Místo: "+mapa.nazevAktualniPolohy());
					if(!mapa.jdiNa(3)) {
						System.out.println("Nelze");
					}
					System.out.println("Místo: "+mapa.nazevAktualniPolohy());
					if(!mapa.jdiNa(0)) {
						System.out.println("Nelze");
					}
					System.out.println("Místo: "+mapa.nazevAktualniPolohy());
					if(!mapa.jdiNa(1)) {
						System.out.println("Nelze");
					}
					System.out.println("Misto: "+mapa.nazevAktualniPolohy());
				} catch(FileNotFoundException e) {
					System.out.println("Soubor s mapou nenalezen.");
				} catch (IOException ex) {
					System.out.println("Nastal problém pøi ètení dat ze souboru.");
				} catch (Exception ex) {
					System.out.println("Data v souboru nepøestavují mapu svìta.");
					System.out.print("-> problém s daty / kódem");
					
				}
	}

}
*/

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;

public class Main extends JFrame {

	Okno contentPane = new Okno();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(470, 340, 470, 340);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
