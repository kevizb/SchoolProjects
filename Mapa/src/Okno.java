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
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.Icon;

public class Okno extends JPanel {
	private JLabel lblNewLabel;

	public Okno() {
		setLayout(null);
		
		JButton btnZpad = new JButton("Z\u00E1pad");
		btnZpad.setBounds(10, 132, 67, 23);
		add(btnZpad);
		btnZpad.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
		           
		    }  
		});  
		
		JButton btnSever = new JButton("Sever");
		btnSever.setBounds(183, 11, 67, 23);
		add(btnSever);
		btnSever.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			           
			    }  
			}); 
		
		JButton btnVchod = new JButton("V\u00FDchod");
		btnVchod.setBounds(373, 132, 67, 23);
		add(btnVchod);
		btnVchod.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
		           
		    }  
		}); 
		
		JButton btnJih = new JButton("Jih");
		btnJih.setBounds(183, 266, 67, 23);
		add(btnJih);
		btnJih.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
		           
		   }  
		}); 
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("M:\\IT\\MapaWindow\\Img\\download.jpg"));
		lblNewLabel.setBounds(87, 45, 276, 210);
		add(lblNewLabel);

	}
	public Icon getLblNewLabelIcon() {
		return lblNewLabel.getIcon();
	}
	public void setLblNewLabelIcon(Icon icon) {
		lblNewLabel.setIcon(icon);
	}
}
