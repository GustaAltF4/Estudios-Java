package jFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interfaz10Parse extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField caja1, caja2;
	private JLabel label1, label2, labelResult;
	private JButton btn;

	public Interfaz10Parse() {
		setLayout(null);
		label1 = new JLabel("Valor 1:");
		label1.setBounds(50, 5, 100, 30);
		add(label1);

		label2 = new JLabel("Valor 2:");
		label2.setBounds(50, 35, 100, 30);
		add(label2);

		labelResult = new JLabel("Resultado:");
		labelResult.setBounds(120, 80, 200, 30);
		add(labelResult);

		caja1 = new JTextField();
		caja1.setBounds(120, 10, 150, 20);
		add(caja1);

		caja2 = new JTextField();
		caja2.setBounds(120, 40, 150, 20);
		add(caja2);

		btn = new JButton("Sumar");
		btn.setBounds(10, 80, 100, 30);
		add(btn);
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			try {
				int num1 = 0, num2 = 0, result = 0;
				num1 = Integer.parseInt(caja1.getText());
				num2 = Integer.parseInt(caja2.getText());// transforma el texto de la caja a un valor int

				result = num1 + num2;

				labelResult.setText("Resultado: " + result);
				caja1.setText("");
				caja2.setText("");
			} catch (Exception f) {
				labelResult.setText("Error " + f);
				caja1.setText("");
				caja2.setText("");
			}

		}

	}

	public static void main(String[] args) {

		Interfaz10Parse i = new Interfaz10Parse();
		i.setBounds(0, 0, 350, 160);
		i.setVisible(true);
		i.setResizable(false);
		i.setLocationRelativeTo(null);

	}

}
