package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraSoma extends JFrame {
    private JTextField campoNumero1, campoNumero2, campoResultado;
    private JButton botaoSomar;

    public CalculadoraSoma() {
        setTitle("Calculadora de Adição");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel label1 = new JLabel("Número 1:");
        JLabel label2 = new JLabel("Número 2:");
        JLabel labelResultado = new JLabel("Resultado:");

        campoNumero1 = new JTextField();
        campoNumero2 = new JTextField();
        campoResultado = new JTextField();
        campoResultado.setEditable(false);

        botaoSomar = new JButton("Somar");

        // Ação do botão
        botaoSomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(campoNumero1.getText());
                    double num2 = Double.parseDouble(campoNumero2.getText());
                    double soma = num1 + num2;
                    campoResultado.setText(String.valueOf(soma));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Digite apenas números válidos!");
                }
            }
        });

        // Adicionando componentes
        add(label1);
        add(campoNumero1);
        add(label2);
        add(campoNumero2);
        add(labelResultado);
        add(campoResultado);
        add(new JLabel()); // espaço vazio
        add(botaoSomar);

        setLocationRelativeTo(null); // Centraliza a janela
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculadoraSoma();
    }
}

