package jFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Interfaz13Menu extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;// es la barra de menu de arriba de todos los programas y solo se puede poner 1
	private JMenu menu1; // aca se pondria cada uno de los menus desplegables por ej en eclipse serian:
							// file, edit,sourse,refactor,etc
	private JMenuItem item1, item2, item3;// aca se pondrian cada una de las opciones del menu desplegable porej: en
											// eclipse hay 3 opciones en sourse entonces tendrian q ser 3 variables de
											// item

	public Interfaz13Menu() {
		setLayout(null);
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		// a la barra de menu no es necesario ponerle coordenadas de ubicacion ni nada
		// porq java de por si tiene ubicacion y tamaño adaptables

		menu1 = new JMenu("Opciones");
		menuBar.add(menu1);// añado el menu "opciones" a la bara de menu

		item1 = new JMenuItem("Rojo");
		item1.addActionListener(this);// evento para esta pestaña
		menu1.add(item1);// agrego el item de menu a l menu q a su vez esta dentor de la barra de menu

		item2 = new JMenuItem("Verde");
		item2.addActionListener(this);
		menu1.add(item2);

		item3 = new JMenuItem("Azul");
		item3.addActionListener(this);
		menu1.add(item3);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Container fondo = this.getContentPane();// this.getContentPane hace q el conteiner tenga la misma
		// dimension q mi intefaz G y si se modifican tambien se modificaria

		if (e.getSource() == item1) {
			fondo.setBackground(new Color(255, 0, 0));// al fondo le asigna un color
		}
		if (e.getSource() == item2) {
			fondo.setBackground(new Color(0, 255, 0));
		}
		if (e.getSource() == item3) {
			fondo.setBackground(new Color(0, 0, 255));
		}

	}

	public static void main(String[] args) {
		Interfaz13Menu i = new Interfaz13Menu();
		i.setBounds(0, 0, 400, 300);
		i.setVisible(true);
		i.setLocationRelativeTo(null);
	}

}
