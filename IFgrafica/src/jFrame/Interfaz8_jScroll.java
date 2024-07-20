package jFrame;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Interfaz8_jScroll extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField textField;
	private JScrollPane scroll;// agrega un scroll al text area para q si se sale el texto
	// del tamaño del textArea aun se pueda ver moviendo el scroll
	private JTextArea textArea;

	public Interfaz8_jScroll() {
		setLayout(null);
		textField = new JTextField();
		textField.setBounds(10, 10, 300, 40);
		add(textField);

		textArea = new JTextArea();
		scroll = new JScrollPane(textArea);
		// se coloca entre parentesis para q el scroll contenga el textArea
		// normalmente se daria tamaño al text area pero como este mismo esta DENTRO
		// del scroll hay q darle dimensiones especificamente al scroll
		scroll.setBounds(10, 50, 400, 300);
		add(scroll);

	}

	public static void main(String[] args) {
		Interfaz8_jScroll i = new Interfaz8_jScroll();
		i.setBounds(0, 0, 500, 400);
		i.setVisible(true);
		i.setResizable(false);
		i.setLocationRelativeTo(null);
	}

}
