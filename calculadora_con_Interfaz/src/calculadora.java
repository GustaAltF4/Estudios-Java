import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora extends JFrame implements ActionListener {
    private final JTextField display;
    private final JButton btnSuma,btnResta,btnMult,btnDiv;
    private final JButton clearBtn,igualbtn;
    private final JButton cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve;
    String numero1= "",numero2="";

    String operador;
    int num1=0,num2=0;




    public calculadora(){
        setLayout(null);
        setTitle("calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);







        display = new JTextField();
        display.setEditable(false);
        display.setBounds(20,10,360,40);
        add(display, BorderLayout.NORTH);
        //botones numeros
        uno= new JButton("1");
        uno.setBounds(10,60,100,30);
        add(uno);
        uno.addActionListener(this);

        dos= new JButton("2");
        dos.setBounds(120,60,100,30);
        add(dos);
        dos.addActionListener(this);

        tres= new JButton("3");
        tres.setBounds(230,60,100,30);
        add(tres);
        tres.addActionListener(this);

        cuatro= new JButton("4");
        cuatro.setBounds(10,100,100,30);
        add(cuatro);
        cuatro.addActionListener(this);

        cinco= new JButton("5");
        cinco.setBounds(120,100,100,30);
        add(cinco);
        cinco.addActionListener(this);

        seis= new JButton("6");
        seis.setBounds(230,100,100,30);
        add(seis);
        seis.addActionListener(this);

        siete= new JButton("7");
        siete.setBounds(10,140,100,30);
        add(siete);
        siete.addActionListener(this);

        ocho= new JButton("8");
        ocho.setBounds(120,140,100,30);
        add(ocho);
        ocho.addActionListener(this);

        nueve= new JButton("9");
        nueve.setBounds(230,140,100,30);
        add(nueve);
        nueve.addActionListener(this);

        cero= new JButton("0");
        cero.setBounds(120,180,100,30);
        add(cero);
        cero.addActionListener(this);
        // botones cuentas
        igualbtn= new JButton("=");
        igualbtn.setBounds(230,180,100,30);
        add(igualbtn);
        igualbtn.addActionListener(this);

        clearBtn= new JButton("c");
        clearBtn.setBounds(10,180,100,30);
        add(clearBtn);
        clearBtn.addActionListener(this);

        btnSuma= new JButton("+");
        btnSuma.setBounds(340,60,50,30);
        add(btnSuma);
        btnSuma.addActionListener(this);

        btnResta= new JButton("-");
        btnResta.setBounds(340,100,50,30);
        add(btnResta);
        btnResta.addActionListener(this);

        btnMult= new JButton("x");
        btnMult.setBounds(340,140,50,30);
        add(btnMult);
        btnMult.addActionListener(this);


        btnDiv= new JButton("/");
        btnDiv.setBounds(340,180,50,30);
        add(btnDiv);
        btnDiv.addActionListener(this);


    }

    public static void main(String[] args) {
        calculadora i= new calculadora();
        i.setVisible(true);
        i.setResizable(false);
        i.setBounds(0,0,415,260);
        i.setLocationRelativeTo(null);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {

            if (e.getSource() == clearBtn) {
                numero1 = "";
                numero2 = "";
                operador = null;
                display.setText("");
                //  isSecondNumber = false;
                return;
            }

            if (e.getSource() == uno) {
                if (operador == null) {
                    numero1 += "1";
                    display.setText(numero1);
                } else {
                    numero2 += "1";
                    display.setText(numero2);
                }
            }
            if (e.getSource() == dos) {
                if (operador == null) {
                    numero1 += "2";
                    display.setText(numero1);
                } else {
                    numero2 += "2";
                    display.setText(numero2);
                }

            }
            if (e.getSource() == tres) {
                if (operador == null) {
                    numero1 += "3";
                    display.setText(numero1);
                } else {
                    numero2 += "3";
                    display.setText(numero2);
                }

            }
            if (e.getSource() == cuatro) {
                if (operador == null) {
                    numero1 += "4";
                    display.setText(numero1);
                } else {
                    numero2 += "4";
                    display.setText(numero2);
                }

            }
            if (e.getSource() == cinco) {
                if (operador == null) {
                    numero1 += "5";
                    display.setText(numero1);
                } else {
                    numero2 += "5";
                    display.setText(numero2);
                }
            }
            if (e.getSource() == seis) {
                if (operador == null) {
                    numero1 += "6";
                    display.setText(numero1);
                } else {
                    numero2 += "6";
                    display.setText(numero2);
                }
            }
            if (e.getSource() == siete) {
                if (operador == null) {
                    numero1 += "7";
                    display.setText(numero1);
                } else {
                    numero2 += "7";
                    display.setText(numero2);
                }
            }
            if (e.getSource() == ocho) {
                if (operador == null) {
                    numero1 += "8";
                    display.setText(numero1);
                } else {
                    numero2 += "8";
                    display.setText(numero2);
                }
            }
            if (e.getSource() == nueve) {
                if (operador == null) {
                    numero1 += "9";
                    display.setText(numero1);
                } else {
                    numero2 += "9";
                    display.setText(numero2);
                }
            }
            if (e.getSource() == cero) {
                if (operador == null) {
                    numero1 += "0";
                    display.setText(numero1);
                } else {
                    numero2 += "0";
                    display.setText(numero2);
                }
            }

            if (e.getSource() == btnSuma) {
                operador = "+";
                display.setText(operador);
            } else if (e.getSource() == btnResta) {
                operador = "-";
                display.setText(operador);
            } else if (e.getSource() == btnMult) {
                operador = "*";
                display.setText(operador);
            } else if (e.getSource() == btnDiv) {
                operador = "/";
                display.setText(operador);
            }

            if (e.getSource() == igualbtn) {
                if (!numero1.isEmpty() && !numero2.isEmpty() && operador != null) {
                    num1 = Integer.parseInt(numero1);
                    num2 = Integer.parseInt(numero2);
                    int resultado = 0;
                    switch (operador) {
                        case "+":
                            resultado = num1 + num2;
                            break;
                        case "-":
                            resultado = num1 - num2;
                            break;
                        case "*":
                            resultado = num1 * num2;
                            break;
                        case "/":
                            resultado = num1 / num2;
                            break;
                    }
                    display.setText(String.valueOf(resultado));
                    numero1 = String.valueOf(resultado);
                    numero2 = "";
                    operador = null;
                }

            }
        }catch (Exception e1){
            display.setText("ERROR: "+e1.getMessage());
            numero1 = "";
            numero2 = "";
            operador = null;

        }

    }



}
