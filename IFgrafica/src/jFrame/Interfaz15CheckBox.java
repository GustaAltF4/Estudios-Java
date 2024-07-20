package jFrame;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Interfaz15CheckBox extends JFrame implements ChangeListener {
	// ChangeListener es la q da enventos a una checkbox

	private static final long serialVersionUID = 1L;
	private JCheckBox check1, check2, check3;

	public Interfaz15CheckBox() {
		setLayout(null);
		check1 = new JCheckBox("Cacona");// no es necesario agregar una label porq las checkbox se le puede agregar texto
		check1.setBounds(10, 10, 150, 30);// son 150 pixeles de ancho porq se considera tambien el texto q acompaña a la checkbox
		check1.addChangeListener(this);
		add(check1);

		check2 = new JCheckBox("Basura");// no es necesario agregar una label porq las checkbox se le puede agregar texto
		check2.setBounds(10, 50, 150, 30);// son 150 pixeles de ancho porq se considera tambien el texto q acompaña a la checkbox
		check2.addChangeListener(this);
		add(check2);

		check3 = new JCheckBox("Mugre");// no es necesario agregar una label porq las checkbox se le puede agregar texto
		check3.setBounds(10, 90, 150, 30);// son 150 pixeles de ancho porq se considera tambien el texto q acompaña a la checkbox
		check3.addChangeListener(this);
		add(check3);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		String cad = "";
		if (check1.isSelected() == true) {
			cad = cad + "Cacona-";
		}
		if (check2.isSelected() == true) {
			cad = cad + "Basura-";
		}
		if (check3.isSelected() == true) {
			cad = cad + "Mugre-";
		}
		setTitle(cad);
	}

	public static void main(String[] args) {
		Interfaz15CheckBox i = new Interfaz15CheckBox();
		i.setBounds(0, 0, 350, 200);
		i.setVisible(true);
		i.setResizable(true);
		i.setLocationRelativeTo(null);
	}

}
