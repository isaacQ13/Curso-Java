package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        double a = 4.3;
        String s = "Bom dia x";
        s = s.replace("x", "senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);
    }
}
