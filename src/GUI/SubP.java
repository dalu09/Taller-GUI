package GUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class SubP extends JPanel {
	
	private PanelExposicion expo;
	private PanelPerro perro;
	private PanelBusqueda bus;
	
	public SubP() {
		
		expo = new PanelExposicion();
		perro = new PanelPerro();
		bus = new PanelBusqueda();
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		setSize(new Dimension(800,300));
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.BOTH;
        add(expo,c);
        c.gridx = 1;
        c.fill = GridBagConstraints.NONE;
        add(perro,c);
        c.gridx = 2;
        c.fill = GridBagConstraints.VERTICAL;
        add(bus,c);
	}
}

