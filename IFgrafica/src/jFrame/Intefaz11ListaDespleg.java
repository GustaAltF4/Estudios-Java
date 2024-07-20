package jFrame;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Intefaz11ListaDespleg extends JFrame implements ItemListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> combo1;// Lista desplegable

	public Intefaz11ListaDespleg() {
		setLayout(null);
		combo1 = new JComboBox<>();// no se puede poner nada dentro de los ()
		combo1.setBounds(10, 10, 80, 20);
		add(combo1);

		combo1.addItem("CACA");// se agregan las cosas por separado proq es un arrayList basicamente
		combo1.addItem("MUGRE");
		combo1.addItem("BASURA");
		combo1.addItem("BOSTA");
		combo1.addItemListener(this);// escucha para cuando la lista haga un evento
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == combo1) {
			String seleccion = (String) combo1.getSelectedItem();
			// String seleccion= combo1.getSelectedItem().toString();
			setTitle(seleccion);
		}
	}

	public static void main(String[] args) {
		Intefaz11ListaDespleg i = new Intefaz11ListaDespleg();
		i.setBounds(0, 0, 250, 100);
		i.setVisible(true);
		i.setResizable(false);
		i.setLocationRelativeTo(null);
	}

}
