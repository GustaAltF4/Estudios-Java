package boludeces;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Asdf extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JCheckBox check1,check2,check3,check4;
	public Asdf() {
		setLayout(null);
		
		check1= new JCheckBox("SI");
		check1.setBounds(10,10,100,30);
		add(check1);
		check2= new JCheckBox("NO");
		check2.setBounds(10,50,100,30);
		add(check2);
		check3= new JCheckBox("NO SE");
		check3.setBounds(10,90,100,30);
		add(check3);
		
		check4= new JCheckBox("NO Soy gei");
		check4.setBounds(10,130,100,30);
		add(check4);
		
	}
	
	public static void main(String[] args) { 
		Asdf i= new Asdf();
		i.setTitle("Tu mamá sabe que sos gei???");
		i.setBounds(0,0,400,166);
		i.setVisible(true);
		//i.setResizable(false);
		i.setLocationRelativeTo(null);
		
	}
	

}
