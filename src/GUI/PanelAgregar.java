package GUI;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelAgregar extends JPanel {
	
	private JLabel lbName;
	private JLabel lbAnios;
	private JLabel lbRaza;
	private JLabel lbPuntos;
	private JLabel lbImg;
	private JButton btnExaminar;
	private JButton btnAgregar;
	
	private JTextField txtName;
	private JTextField txtAnios;
	private JTextField txtRaza;
	private JTextField txtPuntos;
	private JTextField txtImg;
	
	public PanelAgregar() {
		lbName = new JLabel("Nombre:");
		lbName.setPreferredSize(new Dimension(50, 20));
		
		txtName = new JTextField("");
		txtName.setPreferredSize(new Dimension(50, 20));
		
		lbAnios = new JLabel("Edad:");
		lbAnios.setPreferredSize(new Dimension(50, 20));
		
		txtAnios = new JTextField("");
		txtAnios.setPreferredSize(new Dimension(50, 20));
		
		lbRaza = new JLabel("Raza:");
		lbRaza.setPreferredSize(new Dimension(50, 20));

		txtRaza = new JTextField("");
		txtRaza.setPreferredSize(new Dimension(50, 20));
		
		lbPuntos = new JLabel("Puntos:");
		lbPuntos.setPreferredSize(new Dimension(50, 20));
		
		txtPuntos = new JTextField("");
		txtPuntos.setPreferredSize(new Dimension(50, 20));
		
		lbImg = new JLabel("Imagen:");
		lbImg.setPreferredSize(new Dimension(50, 20));
		
		txtImg = new JTextField("");
		txtImg.setPreferredSize(new Dimension(50, 20));
		
		btnExaminar = new JButton("Examinar");
		btnExaminar.setPreferredSize(new Dimension(50, 30));
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setPreferredSize(new Dimension(50, 30));
		
		setBorder(new TitledBorder("Agregar Perro"));
		
		
		add (lbName);
		add (txtName);
		
		add (lbAnios);
		add (txtAnios);
		
		add (lbRaza);
		add (txtRaza);
		
		add (lbPuntos);
		add (txtPuntos);
		
		add (lbImg);
		add (txtImg); 
		
		add(btnExaminar);
		add(btnAgregar);
	}
}

