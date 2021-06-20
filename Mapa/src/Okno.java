/*
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.Icon;

public class Okno extends JPanel {
	private JLabel lblNewLabel;

	String nazev = "Les";

	

	public Okno() {
		setLayout(null);
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(87, 45, 276, 210);
		
		zmenaobr(nazev);
		add(lblNewLabel);

		JButton btnZpad = new JButton("Z\u00E1pad");
		btnZpad.setBounds(10, 132, 67, 23);
		add(btnZpad);
		btnZpad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mapa.jdiNa(3);
				zmenaobr(nazev);
				add(lblNewLabel);
			}
		});

		JButton btnSever = new JButton("Sever");
		btnSever.setBounds(183, 11, 67, 23);
		add(btnSever);
		btnSever.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mapa.jdiNa(0);
				zmenaobr(nazev);
				add(lblNewLabel);
			}
		});

		JButton btnVchod = new JButton("V\u00FDchod");
		btnVchod.setBounds(373, 132, 67, 23);
		add(btnVchod);
		btnVchod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mapa.jdiNa(1);
				zmenaobr(nazev);
				add(lblNewLabel);
			}
		});

		JButton btnJih = new JButton("Jih");
		btnJih.setBounds(183, 266, 67, 23);
		add(btnJih);
		btnJih.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mapa.jdiNa(2);
				zmenaobr(nazev);
				add(lblNewLabel);
			}
		});

		
	}

	private void zmenaobr(String nazev) {
		// TODO Auto-generated method stub
		switch (nazev) {
		case "Les":
			lblNewLabel.setIcon(new ImageIcon("Mapa/src/Pictures/les.jpg"));

		case "Bazina":
			lblNewLabel.setIcon(new ImageIcon("Mapa/src/Pictures/bazina.jpg"));

		case "Hrad":
			lblNewLabel.setIcon(new ImageIcon("Mapa/src/Pictures/hrad.jpg"));

		case "Ves":
			lblNewLabel.setIcon(new ImageIcon("Mapa/src/Pictures/ves.jpg"));

		case "Louka":
			lblNewLabel.setIcon(new ImageIcon("Mapa/src/Pictures/louka.jpg"));

		case "Jezero":
			lblNewLabel.setIcon(new ImageIcon("Mapa/src/Pictures/jezero.jpg"));

		case "Hory":
			lblNewLabel.setIcon(new ImageIcon("Mapa/src/Pictures/hory.jpg"));
		}

	}
}
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
//import java.awt.Image;
//import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class Okno extends JFrame {

	public static final int CANVAS_WIDTH = 700;
	public static final int CANVAS_HEIGHT = 400;
	public static final Color CANVAS_BG_COLOR = Color.WHITE;

	private String imgLokalitaFilename = "Mapa/src/Pictures/";
	private Image imgLokalita;
	private MapCanvas canvas;
	private JLabel nadpis;


	private MapaSveta mapaSveta;

	

	public String lokace(String nazev) {
		switch (nazev) {
		case "les":
			NPC lesNpc = new NPC("Liška", "hladové mládì lišky ");
			Item lesItem = new Item("Sekera", "trošku opotøebená, ale dá se s ní pracovat ");

			return lesNpc.toString() + lesItem.toString();

		case "bazina":
			NPC bazinaNpc = new NPC("Uschlý strom", "smutný uschlý strom (mìní se na uhlí) ");
			Item bazinaItem = new Item("Meè", "Meè padlého vojáka, co se zde utopil ");

			return bazinaNpc.toString() + bazinaItem.toString();

		case "hrad":
			NPC hradNpc = new NPC("Anièka", "Drží v ruce koštì a zametá ");
			Item hradItem = new Item("Brnìní", "bojové brnìní první tøídy, urèeno pro krále ");

			return hradNpc.toString() + hradItem.toString();

		case "ves":
			NPC vesNpc = new NPC("Maøena", "hospodská v místní krèmì (dává slevu na klobásku) ");
			Item vesItem = new Item("Korbel", "pohozený korbel od piva... asi ho tu nìkdo nechal ");

			return vesNpc.toString() + vesItem.toString();

		case "louka":
			NPC loukaNpc = new NPC("Motýl", "krásný pestroberevný motýlek ");
			Item loukaItem = new Item("Vidle", "zapomenuté vidle ");

			return loukaNpc.toString() + loukaItem.toString();

		case "jezero":
			NPC jezeroNpc = new NPC("Vodník Karel",
					"karel je zdejší vodník co si schovává dušièky pod kamenem (neznámé místo) ");
			Item jezeroItem = new Item("Rybáøský prut", "prut, kterým se loví ryby. ");

			return jezeroNpc.toString() + jezeroItem.toString();

		case "hory":
			NPC horyNpc = new NPC("Baèa", "má pár oveèek a zná spoustu baèovských vtipù ");
			Item horyItem = new Item("Nic", "prázdno ");

			return horyNpc.toString() + horyItem;
		}
		return null;

	}

	public Okno() {
		try {
			mapaSveta = MapaSveta.nacti("Mapa/src/mapa.csv");
		} catch (IOException e) {
			System.out.println("Chybi mapa");
		}

		
		try {
			String poloha = mapaSveta.nazevAktualniPolohy().toLowerCase();
			imgLokalita = ImageIO.read(new File(imgLokalitaFilename + poloha + ".jpg"));
		} catch (IOException e) {
			System.out.println("Chybi obrazky");
		}

		JPanel mapaPanel = new JPanel(new BorderLayout());

		JPanel northPanel = new JPanel(new BorderLayout());
		JPanel westPanel = new JPanel(new BorderLayout());
		JPanel eastPanel = new JPanel(new BorderLayout());
		JPanel southPanel = new JPanel(new BorderLayout());

		canvas = new MapCanvas();
		canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

		JButton btnNorth = new JButton("Sever");
		northPanel.add(btnNorth, BorderLayout.CENTER);
		btnNorth.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if (!mapaSveta.jdiNa(0)) {
					JFrame frame = new JFrame("Info");
					JOptionPane.showMessageDialog(frame, "Na sever jit nemuzes");
				}

				try {
					String poloha = mapaSveta.nazevAktualniPolohy().toLowerCase();
					imgLokalita = ImageIO.read(new File(imgLokalitaFilename + poloha + ".jpg"));

				} catch (IOException e) {
					System.out.println("Chybi obrazky");
				}

				canvas.repaint();
				String poloha = mapaSveta.nazevAktualniPolohy().toLowerCase();
				nadpis.setText(mapaSveta.nazevAktualniPolohy() + lokace(poloha));

			}
		});

		JButton btnWest = new JButton("Zapad");
		westPanel.add(btnWest, BorderLayout.CENTER);
		btnWest.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if (!mapaSveta.jdiNa(3)) {
					JFrame frame = new JFrame("Info");
					JOptionPane.showMessageDialog(frame, "Na zapad jit nemuzes");
				}

				try {
					String poloha = mapaSveta.nazevAktualniPolohy().toLowerCase();
					imgLokalita = ImageIO.read(new File(imgLokalitaFilename + poloha + ".jpg"));

				} catch (IOException e) {
					System.out.println("Chybi obrazky");
				}
				String poloha = mapaSveta.nazevAktualniPolohy().toLowerCase();
				canvas.repaint();
				nadpis.setText(mapaSveta.nazevAktualniPolohy() + lokace(poloha));

			}
		});

		JButton btnEast = new JButton("Vychod");
		eastPanel.add(btnEast, BorderLayout.CENTER);
		btnEast.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if (!mapaSveta.jdiNa(1)) {
					JFrame frame = new JFrame("Info");
					JOptionPane.showMessageDialog(frame, "Na vychod jit nemuzes");
				}

				try {
					String poloha = mapaSveta.nazevAktualniPolohy().toLowerCase();
					imgLokalita = ImageIO.read(new File(imgLokalitaFilename + poloha + ".jpg"));

				} catch (IOException e) {
					System.out.println("Chybi obrazky");
				}
				canvas.repaint();
				String poloha = mapaSveta.nazevAktualniPolohy().toLowerCase();
				nadpis.setText(mapaSveta.nazevAktualniPolohy() + lokace(poloha));
			}
		});

		JButton btnSouth = new JButton("Jih");
		southPanel.add(btnSouth, BorderLayout.CENTER);
		btnSouth.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if (!mapaSveta.jdiNa(2)) {
					JFrame frame = new JFrame("Info");
					JOptionPane.showMessageDialog(frame, "Na jih jit nemuzes");
				}

				try {
					String poloha = mapaSveta.nazevAktualniPolohy().toLowerCase();
					imgLokalita = ImageIO.read(new File(imgLokalitaFilename + poloha + ".jpg"));

				} catch (IOException e) {
					System.out.println("Chybi obrazky");
				}
				canvas.repaint();
				String poloha = mapaSveta.nazevAktualniPolohy().toLowerCase();
				nadpis.setText(mapaSveta.nazevAktualniPolohy() + lokace(poloha));

			}
		});

		String poloha = mapaSveta.nazevAktualniPolohy().toLowerCase();
		JPanel lokalitaInfoPanel = new JPanel(new FlowLayout());
		nadpis = new JLabel("Informace: ");
		nadpis.setText(mapaSveta.nazevAktualniPolohy() + lokace(poloha));
		lokalitaInfoPanel.add(nadpis);

		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		Container mapa = mapaPanel;
		mapa.add(canvas, BorderLayout.CENTER);
		mapa.add(northPanel, BorderLayout.NORTH);
		mapa.add(eastPanel, BorderLayout.EAST);
		mapa.add(westPanel, BorderLayout.WEST);
		mapa.add(southPanel, BorderLayout.SOUTH);

		cp.add(mapa, BorderLayout.CENTER);
		cp.add(lokalitaInfoPanel, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hra");
		pack();
		this.setResizable(false);
		setVisible(true);
		requestFocus();
		setLayout(new BorderLayout(0, 0));

	}

	class MapCanvas extends JPanel {

		public void paintComponent(Graphics g) {

			super.paintComponent(g);
			setBackground(CANVAS_BG_COLOR);
			Image img = imgLokalita;
			g.drawImage(img, 0, 0, 700, 400, null);

		}

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Okno();
			}
		});
	}

}