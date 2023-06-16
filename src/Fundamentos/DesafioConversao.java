package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o primeiro Salario: ");
        String valor1 = entrada.next().replace(',', '.');
        System.out.println("Insira o Segundo Salario: ");
        String valor2 = entrada.next().replace(',', '.');
        System.out.println("Insira o Terceiro Salario: ");
        String valor3 = entrada.next().replace(',', '.');

//        System.out.println(valor1);
//        System.out.println(valor2);
//        System.out.println(valor3);

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("Seu Salario medio dos 3 meses Digitados foi: " + media);

        entrada.close();
    }
}
