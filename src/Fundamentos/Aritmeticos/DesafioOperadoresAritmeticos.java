package Fundamentos.Aritmeticos;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {
        int soma = 2 + 3;
        double multiplicacao1 = 6 * soma;
        double divisao1 = 3 * 2;
        double primeiroresultado = Math.pow(multiplicacao1, 2);
        double primeiraexpressao = primeiroresultado / divisao1;
        System.out.println(primeiraexpressao);
        System.out.println((int)primeiraexpressao);

        int subtracao1 = 1 - 5;
        int subtracao2 = 2 - 7;
        double multiplicacao2 = subtracao1 * subtracao2;
        double divisao2 = multiplicacao2 / 2;
        double segundaexpressao = Math.pow(divisao2, 2);
        System.out.println(segundaexpressao);
        System.out.println((int)segundaexpressao);

        double terceiraexpressao = primeiraexpressao - segundaexpressao;
        double divisao3 = Math.pow(10,3);
        double resultado = Math.pow(terceiraexpressao,3) / divisao3;

        System.out.println(resultado);
        System.out.println((int)resultado);


    }
}
