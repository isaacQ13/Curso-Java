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

        String y = "Bom dia X"
                .replace("X", "Gui")
                .toLowerCase()
                .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."
        int b = 3;
        System.out.println(b);
    }
}
