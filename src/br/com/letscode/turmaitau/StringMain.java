package br.com.letscode.turmaitau;

public class StringMain {

    public static void main(String[] args) {

        // o recomendado é utilizar o StringBuffer ou StringBuilder (são mutáveis)

        StringBuilder nomeSB = new StringBuilder();
        nomeSB.append("Juliana");
        nomeSB.append(" ");
        nomeSB.append("Bonfim");
        nomeSB.append(" Fernandes");

        String nomeStr = nomeSB.toString();

        StringBuilder nomeSB2 = nomeSB;  // nomeSB2 aponte para o mesmo espaço de memoria do nomeSB - então o conteudo sempre será igual

        nomeSB.append(" outro sobrenome");

        System.out.println("nomeStr = " + nomeStr);
        System.out.println("nomeSB = " + nomeSB.toString());
        System.out.println("nomeSB2 = " + nomeSB2.toString());


        /* não recomendado trabalhar com String da seguinte maneira:

        String nome = "Juliana";   // 1o espaço na memória

        // string é imutável - toda fez que faz concatenação de string altera a referencia de memoria
        nome = nome + " Bonfim";  // 2o espaço na memória - altera a referencia da variavel na memória

        nome = nome + " Fernandes"; // 3o espaço na memoria - nao consegue recuperar as outras referencias

        nome = "Juliana"; // prega o espaço de memoria criado anteriormente - reutiliza o espaço de memória já existente

        System.gc();  // limpa os espaços de memória não mais utilizados

        nome = "";

        Integer valor = Integer.parseInt("1");

        valor = new Integer("3"); // new Integer - deprecation porque criaria uma outra referencia na memoria

        int valor = 3;

        valor = 4;  // mesma referencia e memoria - tipo primitivo

         */


    }
}
