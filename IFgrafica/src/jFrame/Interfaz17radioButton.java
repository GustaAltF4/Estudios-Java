package jFrame;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Interfaz17radioButton  extends JFrame implements ChangeListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JRadioButton radio1,radio2,radio3;// se crean cada uno de las opciones 
	private ButtonGroup bg;//grupo de botones al cual se asignan dichos botones

	
	
	public Interfaz17radioButton() {
	setLayout(null);
	bg= new ButtonGroup();
	radio1= new JRadioButton("640x480");
	radio1.setBounds(10,20,100,30);
	radio1.addChangeListener(this);
	add(radio1);//agregar el boton
	bg.add(radio1);//agregar el boton al grupo de botones
	
	radio2= new JRadioButton("800x600");
	radio2.setBounds(10,70,100,30);
	radio2.addChangeListener(this);
	add(radio2);//agregar el boton
	bg.add(radio2);//agregar el boton al grupo de botones
	
	radio3= new JRadioButton("1000x700");
	radio3.setBounds(10,120,100,30);
	radio3.addChangeListener(this);
	add(radio3);//agregar el boton
	bg.add(radio3);//agregar el boton al grupo de botones
	}



	@Override
	public void stateChanged(ChangeEvent e) {
		if(radio1.isSelected()) {
			//a diferencia de los checkbox en los radiobox solo se puede seleccionar 1 de ellos
			setSize(640,480);
		}
		if(radio2.isSelected()) {
			setSize(800,600);
		}
		if(radio3.isSelected()) {
			setSize(1000,700);
		}
	}
	
	public static void main(String[] args) {
			Interfaz17radioButton i= new Interfaz17radioButton();
			i.setBounds(0,0,350,230);
			i.setVisible(true);
			i.setResizable(false);
			//i.setLocationRelativeTo(null);
	}

}
