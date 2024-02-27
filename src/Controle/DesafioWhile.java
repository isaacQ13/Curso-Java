package Controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas =0;
        double nota =0;
        double total = 0;

        while (nota != -1){
            System.out.println("Informe a nota: ");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10){
                total += nota;
                quantidadeDeNotas++;
            }
        }
        // Calcular Media
        double media = total / quantidadeDeNotas;
        System.out.println("A Sua Media é: " + media);
        entrada.close();
    }
}
