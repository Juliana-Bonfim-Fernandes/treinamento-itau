package br.com.letscode.turmaitau;

public class TiposPrimitivosInteiros {

    // variável de classe - fora do método - se tiver um outro método, pode utilizar esta variável tb.
    static long numeroLong2;

    // variável constante - valor não muda, não é sobrescrito que é bloqueado pelo "final"
    // pode utilizar em parâmetros
    final static int NUMERO_INT = 5;
    final static String RESULTADO = "resultado da operacao ";

    public static void main(String[] args) {

        /* variáveis dentro de um método são chamadas de variáveis locais
         * nascem e morrem junto com o método
        */

        /* byte
           short
           int
           long
         */

        short b = 1;
        int numeroInt = 5;
        long numeroLong = 2;

        /* operadores:
                soma +
                subtração -
                divisão /
                multiplicação *
         */

        int soma = numeroInt + 10;
        System.out.println("soma = " + soma);

        // não permite dividir uma variável int por uma long. é preciso converter (cast)
        int divisao = numeroInt / (int) numeroLong;
        // ou int divisao = (int) (numeroInt / numeroLong);
        System.out.println("divisao 1 = " + divisao);

        int divisao2 = NUMERO_INT / numeroInt;
        System.out.println("divisao 2 = " + divisao2);


    }

    void somar (int var1, int var2) {

        int soma = var1 + var2;
        System.out.println("resultado da soma = " + soma);

    }
}
