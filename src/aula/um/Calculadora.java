package aula.um;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        double primeiroValor, segundoValor;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        primeiroValor = input.nextDouble();
        System.out.println("Insira o segundo valor: ");
        segundoValor = input.nextDouble();

        System.out.println("O resultado da soma: " + soma(primeiroValor, segundoValor));
        System.out.println("O resultado da subtração: " + subtracao(primeiroValor, segundoValor));
        System.out.println("O resultado da multiplicação: " + multiplicacao(primeiroValor, segundoValor));
        System.out.println("O resultado da divisão: " + divisao(primeiroValor,segundoValor));

        input.close();
    }
    public static double soma(double a, double b){
        return a + b;
    }

    public static double subtracao(double a, double b){
        return a - b;
    }

    public static double multiplicacao(double a, double b){
        return a * b;
    }

    public static double divisao(double a, double b){
        return a / b;
    }


}