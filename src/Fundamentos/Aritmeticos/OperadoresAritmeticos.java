package Fundamentos.Aritmeticos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        System.out.println(2 + 3);

        var x = 99.59;
        double y = 2.41;

        System.out.println(x + y); //Adição
        System.out.println(x - y); //Subtração
        System.out.println(x * y); //Multiplicação
        System.out.println(x / y); //Divisão

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double) b);
        System.out.println(a / (float) b);

        System.out.println(a % b); //Resto de divisão
        System.out.println(8 % 3);

        System.out.println(x + y - a * b);
    }
}
