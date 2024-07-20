package boludeces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Asdasd2 extends JFrame implements ActionListener, ChangeListener {

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JRadioButton Rbox1,Rbox2;
	private ButtonGroup bg;
	private JButton btn;
	
	
	

	public Asdasd2() {
		setLayout(null);
		label= new JLabel("Sos Homosexual?");
		label.setBounds(10,10,200,30);
		add(label);
		
		bg=new ButtonGroup();
		
		Rbox1= new JRadioButton("Si");
		Rbox1.setBounds(10,40,200,30);
		bg.add(Rbox1);
		Rbox1.addChangeListener(this);
		add(Rbox1);
		
		Rbox2= new JRadioButton("No");
		Rbox2.setBounds(10,70,200,30);
		bg.add(Rbox2);
		Rbox2.addChangeListener(this);
		add(Rbox2);
		
		btn=new JButton("Aceptar");
		btn.setBounds(10, 110, 100, 30);
		btn.addActionListener(this);
		btn.setEnabled(false);
		add(btn);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(Rbox1.isSelected()) {
			btn.setEnabled(true);
		}
		if(Rbox2.isSelected()){
			btn.setEnabled(false);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			System.exit(0);	
		}
		
	}
	public static void main(String[] args) {
		Asdasd2 i= new Asdasd2();
		i.setBounds(0, 0, 350, 200);
		i.setVisible(true);
		i.setResizable(false);
		i.setLocationRelativeTo(null);
	}

}
