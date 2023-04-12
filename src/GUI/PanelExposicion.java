package GUI;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;

public class PanelExposicion extends JPanel{
	
	private JTextArea txtarea;
	private JScrollPane scrollPane; 
	private JButton boton0;
	private JButton boton1;
	
	public PanelExposicion() {

		txtarea = new JTextArea();
		scrollPane = new JScrollPane(txtarea);
		scrollPane.setPreferredSize(new Dimension(100, 100));
		boton0 = new JButton("Juanito");
		boton1 = new JButton("Josesito");
		
		
		
		scrollPane.add(boton0);
		scrollPane.add(boton1);
		
		add(scrollPane);
		
		setBorder(new TitledBorder("Perros en la exposición"));

		setLayout(new GridLayout(3,2));
	}
}
