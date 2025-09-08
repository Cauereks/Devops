package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Calculadora - Escolha uma operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Digite a opção (1-4): ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        try {
            switch (opcao) {
                case 1:
                    resultado = calc.somar(num1, num2);
                    break;
                case 2:
                    resultado = calc.subtrair(num1, num2);
                    break;
                case 3:
                    resultado = calc.multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = calc.dividir(num1, num2);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    operacaoValida = false;
            }

            if (operacaoValida) {
                System.out.println("Resultado: " + resultado);
            }

        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
