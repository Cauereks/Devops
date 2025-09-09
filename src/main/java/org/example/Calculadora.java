package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame {
    private JTextField campoNumero1, campoNumero2, campoResultado;
    private JButton botaoSomar, botaoSubtrair, botaoDividir;

    public Calculadora() {
        setTitle("Calculadora");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        JLabel label1 = new JLabel("Número 1:");
        JLabel label2 = new JLabel("Número 2:");
        JLabel labelResultado = new JLabel("Resultado:");

        campoNumero1 = new JTextField();
        campoNumero2 = new JTextField();
        campoResultado = new JTextField();
        campoResultado.setEditable(false);

        botaoSomar = new JButton("Somar");
        botaoSubtrair = new JButton("Subtrair");
        botaoDividir = new JButton("Dividir");

//      Função de Somar
        botaoSomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacao("soma");
            }
        });

//      Função Subtração
        botaoSubtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacao("subtracao");
            }
        });

//      Função Divisão
        botaoDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarOperacao("divisao");
            }
        });

        add(label1);
        add(campoNumero1);
        add(label2);
        add(campoNumero2);
        add(labelResultado);
        add(campoResultado);
        add(botaoSomar);
        add(botaoSubtrair);
        add(botaoDividir);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void realizarOperacao(String operacao) {
        try {
            double num1 = Double.parseDouble(campoNumero1.getText());
            double num2 = Double.parseDouble(campoNumero2.getText());
            double resultado = 0;

            switch (operacao) {
                case "soma":
                    resultado = num1 + num2;
                    break;
                case "subtracao":
                    resultado = num1 - num2;
                    break;
                case "divisao":
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida!");
                        return;
                    }
                    resultado = num1 / num2;
                    break;
            }

            campoResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite apenas números válidos!");
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
