import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc2 extends JFrame implements ActionListener {

    private JTextField display;
    private JButton btnSuma, btnResta, btnMult, btnDiv;
    private JButton clearBtn, igualbtn;
    private JButton cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve;
    private String numero1 = "", numero2 = "";
    private String operador;
    private boolean isSecondNumber = false;

    public calc2() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setPreferredSize(new Dimension(400, 60));
        add(display, BorderLayout.NORTH);

        JPanel panelNumeros = new JPanel();
        panelNumeros.setLayout(new GridLayout(4, 3, 10, 10));
        panelNumeros.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        uno = new JButton("1");
        dos = new JButton("2");
        tres = new JButton("3");
        cuatro = new JButton("4");
        cinco = new JButton("5");
        seis = new JButton("6");
        siete = new JButton("7");
        ocho = new JButton("8");
        nueve = new JButton("9");
        cero = new JButton("0");

        JButton[] botonesNumeros = {uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero};
        for (JButton boton : botonesNumeros) {
            boton.setFont(new Font("Arial", Font.BOLD, 24));
            boton.addActionListener(this);
            panelNumeros.add(boton);
        }

        add(panelNumeros, BorderLayout.CENTER);

        JPanel panelOperaciones = new JPanel();
        panelOperaciones.setLayout(new GridLayout(5, 1, 10, 10));
        panelOperaciones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        btnSuma = new JButton("+");
        btnResta = new JButton("-");
        btnMult = new JButton("x");
        btnDiv = new JButton("/");
        clearBtn = new JButton("C");
        igualbtn = new JButton("=");

        JButton[] botonesOperaciones = {btnSuma, btnResta, btnMult, btnDiv, clearBtn, igualbtn};
        for (JButton boton : botonesOperaciones) {
            boton.setFont(new Font("Arial", Font.BOLD, 24));
            boton.addActionListener(this);
            panelOperaciones.add(boton);
        }

        add(panelOperaciones, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        calc2 calc = new calc2();
        calc.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == clearBtn) {
            numero1 = "";
            numero2 = "";
            operador = null;
            display.setText("");
            isSecondNumber = false;
            return;
        }

        if (source == uno || source == dos || source == tres || source == cuatro ||
                source == cinco || source == seis || source == siete || source == ocho ||
                source == nueve || source == cero) {

            JButton button = (JButton) source;
            if (!isSecondNumber) {
                numero1 += button.getText();
                display.setText(numero1);
            } else {
                numero2 += button.getText();
                display.setText(numero2);
            }
        } else if (source == btnSuma || source == btnResta || source == btnMult || source == btnDiv) {
            JButton button = (JButton) source;
            operador = button.getText();
            display.setText(operador);
            isSecondNumber = true;
        } else if (source == igualbtn) {
            if (!numero1.isEmpty() && !numero2.isEmpty() && operador != null) {
                int num1 = Integer.parseInt(numero1);
                int num2 = Integer.parseInt(numero2);
                int resultado = 0;

                switch (operador) {
                    case "+":
                        resultado = num1 + num2;
                        break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                    case "x":
                        resultado = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            display.setText("Error: Div/0");
                            return;
                        }
                        break;
                }
                display.setText(String.valueOf(resultado));
                numero1 = String.valueOf(resultado);
                numero2 = "";
                operador = null;
                isSecondNumber = false;
            }
        }
    }
}