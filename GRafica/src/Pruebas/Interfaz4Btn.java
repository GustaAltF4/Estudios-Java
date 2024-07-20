package Pruebas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Interfaz4Btn extends JFrame implements ActionListener {

	
	private static final long serialVersionUID = 1L;

	JButton boton1;// creamos un objeto de un boton
	
	
	public Interfaz4Btn() {
		setLayout(null);//crea componentes a travez de coordenadas
		boton1= new JButton("Cerrar");//texto q lleva el boton dentro
		boton1.setBounds(300,250,100,30);//ubicacion dentor de la interfaz y tamaño del boton
		add(boton1);//si no hay metodo add no aparece el boton
		boton1.addActionListener(this);//implementa la interface ActionListener q espera cuando este(this) boton genere un Eveto 
		
	}

	//metodo de la interfaz ActionListener para escribir la logica del envento q debe capturar
	@Override
	public void actionPerformed(ActionEvent e) {
		//getSource() metodo ActionEvent recuoera el evento q se genero en el boton ...verifica q boton se utilizo q en este caso solo hay 1
		if(e.getSource() == boton1) {
			System.exit(0);//indicamos al programa q si se toca el boton (evento) se cierra el programa con el metodo System.exit(0);
		}
		
	
	}
	public static void main(String[] args) {
		Interfaz4Btn i = new Interfaz4Btn();// creamos el objeto de tipo interfaz
		i.setBounds(0,0,480,350);// tamaño de la interfaz
		i.setVisible(true);//q sea visible
		i.setResizable(false);// q no se pueda modificar tamaño
		i.setLocationRelativeTo(null);//se inicia al centro de la pantalla
		
		
	}

}
