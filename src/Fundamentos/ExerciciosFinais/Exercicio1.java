package Fundamentos.ExerciciosFinais;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();
        double Calculo1 = Fahrenheit - 32;
        double conversao = Calculo1 * 5 / 9;

        System.out.print("Valor em celsius: " + conversao);

        scanner.close();
    }
}
