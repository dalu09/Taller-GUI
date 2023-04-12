package GUI;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class PanelConsultas extends JPanel {
	
	private JButton btnGanador;
	private JButton btnPuntaje;
	private JButton btnEdad;
	
	public PanelConsultas() {
		
		setBorder(new TitledBorder("Consultas Exposición"));
		
		btnGanador = new JButton("Ganador");
		btnGanador.setPreferredSize(new Dimension(50, 30));
		
		btnPuntaje = new JButton("Menor Puntaje");
		btnPuntaje.setPreferredSize(new Dimension(50, 30));
		
		btnEdad = new JButton("Más viejo");
		btnEdad.setPreferredSize(new Dimension(50, 30));
		
		add (btnGanador);
		add (btnPuntaje);
		add (btnEdad);
	}

}
