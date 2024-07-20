package jFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfaz5 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btn1, btn2, btn3;
	private JLabel label1;

	public Interfaz5() {
		setLayout(null);
		btn1 = new JButton("1");
		btn1.setBounds(10, 100, 90, 30);
		add(btn1);
		btn1.addActionListener(this);

		btn2 = new JButton("2");
		btn2.setBounds(110, 100, 90, 30);
		add(btn2);
		btn2.addActionListener(this);

		btn3 = new JButton("3");
		btn3.setBounds(210, 100, 90, 30);
		add(btn3);
		btn3.addActionListener(this);

		label1 = new JLabel("En espera...");
		label1.setBounds(10, 10, 300, 30);
		add(label1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			label1.setText("El que toca el boton 1 se la come");// agregar un texto
		}
		if (e.getSource() == btn2) {
			label1.setText("El que toca el boton 2 se la morfa");
		}
		if (e.getSource() == btn3) {
			label1.setText("Te salvaste...");
		}

	}

	public static void main(String[] args) {
		Interfaz5 i = new Interfaz5();
		i.setBounds(0, 0, 350, 200);
		i.setVisible(true);
		i.setResizable(false);
		i.setLocationRelativeTo(null);
	}
}
