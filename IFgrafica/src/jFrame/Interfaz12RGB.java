package jFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfaz12RGB extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label1, label2, label3;
	private JComboBox<Integer> combo1, combo2, combo3;
	private JButton btn;

	public Interfaz12RGB() {
		setLayout(null);
		label1 = new JLabel("Rojo");
		label1.setBounds(10, 10, 100, 10);
		add(label1);

		combo1 = new JComboBox<>();
		combo1.setBounds(120, 10, 50, 30);
		for (int i = 0; i <= 255; i++) {
			combo1.addItem(i);
			// combo1.addItem(String.valueOf(i));
		}
		add(combo1);

		label2 = new JLabel("Verde");
		label2.setBounds(10, 50, 100, 10);
		add(label2);

		combo2 = new JComboBox<>();
		combo2.setBounds(120, 50, 50, 30);
		for (int i = 0; i <= 255; i++) {
			combo2.addItem(i);
			// combo2.addItem(String.valueOf(i));
		}
		add(combo2);

		label3 = new JLabel("Azul");
		label3.setBounds(10, 90, 100, 10);
		add(label3);

		combo3 = new JComboBox<>();
		combo3.setBounds(120, 90, 50, 30);
		for (int i = 0; i <= 255; i++) {
			combo3.addItem(i);
			// combo3.addItem(String.valueOf(i));
		}
		add(combo3);

		btn = new JButton("Fijar color");
		btn.setBounds(10, 130, 100, 30);
		add(btn);
		btn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			String cad1 = combo1.getSelectedItem().toString();
			String cad2 = combo2.getSelectedItem().toString();
			String cad3 = combo3.getSelectedItem().toString();// guarda los valores q seleccione el usuria en la
																// variable cad

			int rojo = Integer.parseInt(cad1);
			int verde = Integer.parseInt(cad2);
			int azul = Integer.parseInt(cad3);

			Color color1 = new Color(rojo, verde, azul);// ROJO,VERDE,AZUL siempre van en ese orden
			btn.setBackground(color1);

		}

	}

	public static void main(String[] args) {
		Interfaz12RGB i = new Interfaz12RGB();
		i.setBounds(0, 0, 190, 220);
		i.setVisible(true);
		i.setResizable(false);
		i.setLocationRelativeTo(null);
	}

}
