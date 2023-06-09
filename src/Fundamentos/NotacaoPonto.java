package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        double a = 4.3;
        String s = "Bom dia x";

        s = s.replace("x", "senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        String y = "MASSIFICAÇÃO DO USO DE FERRAMENTAS DE IA PARA AS INDÚSTRIAS DE TRANSFORMAÇÕES: QUÍMICAS E DE ALIMENTOS"
                .toLowerCase()
                .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."
        int b = 3;
        System.out.println(b);
    }
}
