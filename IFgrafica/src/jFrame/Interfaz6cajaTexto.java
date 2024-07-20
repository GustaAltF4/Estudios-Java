package jFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interfaz6cajaTexto extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField cajaTexto;// varialble de la caja de texto
	private JLabel label1;
	private JButton btn;

	public Interfaz6cajaTexto() {
		setLayout(null);
		label1 = new JLabel("Usuario");
		label1.setBounds(10, 10, 100, 30);
		add(label1);

		cajaTexto = new JTextField();// si pongo algo entre el parentesis apareceria en la caja
		cajaTexto.setBounds(120, 17, 150, 20);
		add(cajaTexto);

		btn = new JButton("Aceptar");
		btn.setBounds(10, 80, 100, 30);
		add(btn);
		btn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {

			String texto = cajaTexto.getText();// GET text a difernecia de setText q lo agrega texto
			// getText obtiene el texto q usuario escribe dentro del JtextField y se lo
			// asigna a una variable
			setTitle(texto);// metodo set Title pone el nombre a la intefaz

		}

	}

	public static void main(String[] args) {
		Interfaz6cajaTexto i = new Interfaz6cajaTexto();
		i.setBounds(0, 0, 400, 200);
		i.setVisible(true);
		i.setResizable(false);
		i.setLocationRelativeTo(null);
	}

}
