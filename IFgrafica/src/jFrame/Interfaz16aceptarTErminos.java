package jFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Interfaz16aceptarTErminos extends JFrame implements ActionListener, ChangeListener {
// se implementa la escucha de los eventos del boton y del checkbox 

	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JCheckBox check;
	private JButton btn;

	public Interfaz16aceptarTErminos() {
		setLayout(null);
		label = new JLabel("Aceptar terminos y condiciones");
		label.setBounds(10, 10, 400, 30);
		add(label);

		check = new JCheckBox("Acepto");
		check.setBounds(10, 50, 100, 30);
		check.addChangeListener(this);
		add(check);

		btn = new JButton("Continuar");
		btn.setBounds(10, 100, 100, 30);
		add(btn);
		btn.addActionListener(this);
		btn.setEnabled(false);// deshabilita el boton hasta q yo diga lo contrario
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if (check.isSelected() == true) {
			btn.setEnabled(true);// habilita el boton solo si el se cliickea en el checkbox
		} else {
			btn.setEnabled(false);// si no se agrega el else se puede checkear la box y luego descheckearla
			// y el boton va a quedar habilitado para pulsar
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			System.exit(0);// si tocan el boton se cierra
		}

	}

	public static void main(String[] args) {
		Interfaz16aceptarTErminos i = new Interfaz16aceptarTErminos();
		i.setBounds(0, 0, 350, 200);
		i.setVisible(true);
		i.setResizable(false);
		i.setLocationRelativeTo(null);
	}

}
