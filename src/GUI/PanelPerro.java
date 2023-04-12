package GUI;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PanelPerro extends JPanel {
	
	private JLabel img;
	private JLabel name;
	private JLabel raza;
	private JLabel edad;
	private JLabel puntos;
	private JTextField txtName;
	private JTextField txtAnios;
	private JTextField txtRaza;
	private JTextField txtPuntos;
	
	public PanelPerro() {
		ImageIcon imageicono = new ImageIcon("img.png");
		img = new JLabel();
		img.setIcon(imageicono);
		img.setPreferredSize(new Dimension(100,200));
		
		name = new JLabel("Nombre:");
		name.setPreferredSize(new Dimension(50, 20));
		
		txtName = new JTextField();
		txtName.setPreferredSize(new Dimension(50, 20));
		
		raza = new JLabel("Raza:");
		raza.setPreferredSize(new Dimension(50, 20));
		
		txtRaza = new JTextField();
		txtRaza.setPreferredSize(new Dimension(50, 20));
		
		edad = new JLabel("Edad:");
		edad.setPreferredSize(new Dimension(50, 20));
		
		txtAnios = new JTextField();
		txtAnios.setPreferredSize(new Dimension(50, 20));
		
		puntos = new JLabel("Puntos");
		puntos.setPreferredSize(new Dimension(50, 20));
		
		txtPuntos = new JTextField();
		txtPuntos.setPreferredSize(new Dimension(50, 20));
		
		setLayout (new GridLayout(1,1));
		this.setSize(new Dimension(304,198));
		add(img);
		setSize(new Dimension(304,198));
		
		setBorder(new TitledBorder("Datos Perro"));
		setLayout(new GridLayout(3,2));
		
		add (name);
		add (txtName);
		
		add (edad);
		add (txtAnios);
		
		add (raza);
		add (txtRaza);
		
		add (puntos);
		add (txtPuntos);
		
		
	}

}
