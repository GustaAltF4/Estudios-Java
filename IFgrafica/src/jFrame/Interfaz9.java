package jFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Interfaz9 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btn;
	private JTextField caja;
	private JScrollPane scroll;
	private JTextArea area;

	String texto = "";

	public Interfaz9() {
		setLayout(null);

		caja = new JTextField();
		caja.setBounds(10, 10, 200, 30);
		add(caja);

		btn = new JButton("Agregar...");
		btn.setBounds(250, 10, 150, 30);
		add(btn);
		btn.addActionListener(this);

		area = new JTextArea();
		scroll = new JScrollPane(area);
		scroll.setBounds(10, 50, 400, 300);
		add(scroll);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			texto += caja.getText() + "\n";// "\n" salto de linea
			// con el metodo getText recupera lo excrito en la caja y lo
			// acumula dentro de la variable texto
			area.setText(texto);
			// metodo setText para agregar el texto dentro del JTextArea
			caja.setText("");
			// asi se limpiaria la caja luego de agregargarse al area de texto
			// y quedaria en blanco
		}
	}

	public static void main(String[] args) {
		Interfaz9 i = new Interfaz9();
		i.setBounds(0, 0, 450, 400);
		i.setVisible(true);
		i.setResizable(false);
		i.setLocationRelativeTo(null);
	}

}
