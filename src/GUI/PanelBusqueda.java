package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class PanelBusqueda extends JPanel {
	
	private JButton btnRaza;
	private JButton btnPuntos;
	private JButton btnEdad;
	private JButton btnPerro;
	
	public PanelBusqueda() {
		
		setBorder(new TitledBorder("Busqueda y Ordenamientos"));
		
		btnRaza = new JButton("Ordenar por Raza");
		btnRaza.setPreferredSize(new Dimension(50, 30));
		
		btnPuntos = new JButton("Ordenar por Puntos");
		btnPuntos.setPreferredSize(new Dimension(50, 30));
		
		btnEdad = new JButton("Ordenar por Edad");
		btnEdad.setPreferredSize(new Dimension(50, 30));
		
		btnPerro = new JButton("Buscar por Perro");
		btnPerro.setPreferredSize(new Dimension(50, 30));
		
		add (btnRaza);
		add (btnPuntos);
		add (btnEdad);
		add (btnPerro);
	}

}
