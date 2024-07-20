package jFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfaz3Etiqueta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label1;// forma de declarar etiquetas
	private JLabel label2;

	public Interfaz3Etiqueta() {
		setLayout(null);
		label1 = new JLabel("Interfaz Grafica de Morondanga");
		label1.setBounds(10, 20, 300, 30);// y esta seria la ubicacion de la etiqueta dentro de la interfaz
		add(label1);// sin el metodo add() no va a mostrar la etiqueta
		label2 = new JLabel("Version 1.0");
		label2.setBounds(10, 100, 100, 30);
		add(label2);
	}

	public static void main(String[] args) {
		Interfaz3Etiqueta i = new Interfaz3Etiqueta();
		i.setBounds(0, 0, 300, 200);// no use las coordenadas de ubicacion porq el metodo setLocationRelativeTo lo
									// pone siempre al centro
		i.setResizable(false);// no se puede modoficar tamaño interfaz
		i.setVisible(true);
		i.setLocationRelativeTo(null);

	}

}
