package GUI;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class PanelExtensiones extends JPanel {
	
	private JButton btn1;
	private JButton btn2;
	
	public PanelExtensiones() {
		
		setBorder(new TitledBorder("Puntos de Extensión"));
		
		btn1 = new JButton("Opción 1");
		btn1.setPreferredSize(new Dimension(50, 30));
		
		btn2 = new JButton("Opción 2");
		btn2.setPreferredSize(new Dimension(50, 30));
		
		add (btn1);
		add (btn2);
	}     

}