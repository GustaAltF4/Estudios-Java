package jFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Interfaz14Submenu extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu menu1, menu2, menu3;
	private JMenuItem item1, item2, item3, item4;

	public Interfaz14Submenu() {
		setLayout(null);
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menu1 = new JMenu("Opciones");
		menuBar.add(menu1);

		menu2 = new JMenu("Tamaño de la ventana");
		menu1.add(menu2);// literalmente para crear un submenu es meter un menu dentro de otro

		menu3 = new JMenu("Color de Fondo");
		menu1.add(menu3);

		item1 = new JMenuItem("300x200");
		menu2.add(item1);// agrega el item al submenu2
		item1.addActionListener(this);

		item2 = new JMenuItem("640x480");
		menu2.add(item2);// agrega el item al submenu2
		item2.addActionListener(this);

		item3 = new JMenuItem("Rojo");
		menu3.add(item3);// agrega el item al submenu3
		item3.addActionListener(this);

		item4 = new JMenuItem("Azul");
		menu3.add(item4);// agrega el item al submenu3
		item4.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == item1) {
			setSize(300, 200);// metodo get Size cambia las dimensiones de la pantalla
		}
		if (e.getSource() == item2) {
			setSize(640, 480);// setSize(ancho, alto)
		}
		if (e.getSource() == item3) {
			getContentPane().setBackground(new Color(255, 0, 0));// hace cambios en la intefez grafica antes lo use para
																	// cambiar el color pero dentro de un contendor
		}
		if (e.getSource() == item4) {
			getContentPane().setBackground(new Color(0, 0, 255));
		}

	}

	public static void main(String[] args) {
		Interfaz14Submenu i = new Interfaz14Submenu();
		i.setBounds(0, 0, 200, 100);
		i.setVisible(true);
		i.setResizable(false);
		i.setLocationRelativeTo(null);
	}

}
