package Pruebas;
import javax.swing.JFrame;

public class InterFaz2 extends JFrame {

	private static final long serialVersionUID = 1L;

	public InterFaz2() {
		setLayout(null);
		
	}

	public static void main(String[] args) {
		InterFaz2 inter1= new InterFaz2();
		inter1.setBounds(350,100,400,500);
		//.setBounds(eje de lados, eje de altura,ancho en px de la interfaz,alto en px de la intefaz);
		inter1.setVisible(true);// para q se vea o no (true o false)
		inter1.setLocationRelativeTo(null);
		//.setLocationRelativeTo(null); este metodo hace q la interfaz aparezca siempre al centro de la pantalla
		// sin importar sin en el metodo anterior se pusieron coordenadas de aparicion
		inter1.setResizable(false);
		//.setResizable(false); este metodo restringe al usuario para q no se pueda modificar el tamaño de la interfaz
		
	}

}
