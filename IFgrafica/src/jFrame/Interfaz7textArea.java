package jFrame;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Interfaz7textArea extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textfield; // campo de texto q solo permite escribir en una linea de texto
	private JTextArea textArea;// campo de texto q solo permite escribir en mas de una linea de texto

	public Interfaz7textArea() {
		setLayout(null);
		textfield = new JTextField();
		textfield.setBounds(10, 10, 300, 40);
		add(textfield);

		textArea = new JTextArea();
		textArea.setBounds(10, 50, 400, 400);
		add(textArea);

	}

	public static void main(String[] args) {
		Interfaz7textArea i = new Interfaz7textArea();
		i.setBounds(0, 0, 450, 500);
		i.setVisible(true);
		i.setResizable(false);
		i.setLocationRelativeTo(null);
	}

}
