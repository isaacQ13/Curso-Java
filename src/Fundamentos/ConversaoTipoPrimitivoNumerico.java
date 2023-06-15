package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; // Conversão Implícita
        System.out.println(a);

        float b = (float) 1.123456; // Conversão Explícita (CAST)
        System.out.println(b);

        int c = 127;
        byte d = (byte) c; // Conversão Explícita (CAST)
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; // Conversão Explícita (CAST)
        System.out.println(f);
    }
}
