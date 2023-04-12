package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class VentanaCanes extends JFrame {
	private PanelAgregar panelAgregar;
	private PanelBusqueda panelBusquedas;
	private PanelConsultas panelConsulta;
	private PanelExposicion panelExposicion;
	private PanelExtensiones panelExtensiones;
	private PanelPerro panelPerro;
	private SubP subP;
	
	public VentanaCanes() {
		panelAgregar = new PanelAgregar();
		panelBusquedas = new PanelBusqueda();
		panelConsulta = new PanelConsultas();
		panelExposicion = new PanelExposicion();
		panelExtensiones = new PanelExtensiones();
		panelPerro = new PanelPerro();
		subP = new SubP();
		subP.setPreferredSize(new Dimension(1000, 400));
		
		
		setLayout(new BorderLayout());
		
		
		add(subP, BorderLayout.NORTH);
		add(panelAgregar, BorderLayout.WEST);
		add(panelConsulta, BorderLayout.EAST);
		add(panelExtensiones, BorderLayout.SOUTH);
		
		setSize(new Dimension(300,185));
		setResizable(true);
		setTitle("Perritus :)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		VentanaCanes vc = new VentanaCanes();
	}
}
