package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionario

        // Tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3234845223L;

        // Tipos Numericos Reais
        float salario = 11445.44F;
        double vendasAcumuladas = 2991797103.01;
        // Tipo Booleano
        boolean estaDeFerias = false;
        // Tipo Caractere
        char status = 'A'; // Ativo
        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);
        // Numero total de viagens
        System.out.println(numeroDeVoos / 2);
        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": Ganha -> " + salario);
        System.out.println("Férias?: " + estaDeFerias);
        System.out.println("Status na empresa?: " + status);
    }

}
