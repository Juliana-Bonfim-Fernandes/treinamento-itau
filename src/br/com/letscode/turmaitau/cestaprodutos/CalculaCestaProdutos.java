package br.com.letscode.turmaitau.cestaprodutos;

import br.com.letscode.turmaitau.cestaprodutos.enums.TipoPreco;

import java.util.Scanner;

public class CalculaCestaProdutos {

    /* se usar somente nessa classe, pode colocar dentro como constante, senão cria uma classe.
    enum TipoPreco {
        CARO,
        BARATO
    }*/

    //final faz a variável se tornar constante, sem poder alterar o valor
    private final static int QTDE_MAX_PRODUTOS = 5;

    Scanner scanner = null;
    RecuperaDadosProduto recuperaDadosProduto = null;

    String[] nomesProdutos;
    Double[] precosProdutos;
    Integer qtdeProdutos;

    /* primitivo - int, double, float = 0
        se quiser que a variável seja nula, deve usar o tipo Uppercase como classe
     */
    public CalculaCestaProdutos() {

        this.scanner = new Scanner(System.in);

        this.recuperaDadosProduto = new RecuperaDadosProduto(scanner);

        this.nomesProdutos = new String[5];
        /*
            nomesProdutos[0] = null;
            nomesProdutos[1] = null;
            nomesProdutos[2] = null;
            nomesProdutos[3] = null;
            nomesProdutos[4] = null;

         ou pode inicializar
            nomesProdutos[0] = "";
            nomesProdutos[1] = "";
            nomesProdutos[2] = "";
            nomesProdutos[3] = "";
            nomesProdutos[4] = "";
            //nomesProdutos[5] = ""; //ArrayIndexOutOfBoundsException

         ou pode inicializar
            this.nomesProdutos = new String[]{"","","","",""};
         */

        this.precosProdutos = new Double[5];
        this.qtdeProdutos = Integer.parseInt("0");
    }

    public void recuperarDadosECalcular() {

        while (this.qtdeProdutos < QTDE_MAX_PRODUTOS) {

            this.nomesProdutos[qtdeProdutos] = recuperaDadosProduto.recuperaNome();   // variável de classe
            this.precosProdutos[qtdeProdutos] = recuperaDadosProduto.recuperaPreco(); // variável de classe

            System.out.println("Digite X para encerrar ou outra letra para continuar.");
            Boolean sair = scanner.next().equalsIgnoreCase("X");
            /* ou
                String letra = this.scanner.next();
                Boolean sair = letra.equals("X");
             */

            /*
                ""  => empty
                " " => blank
             */

            qtdeProdutos++;  //usa o valor e depois incrementa
            // ++qtdeProdutos;  incrementa e depois usa o valor já incrementado

            if (sair) {
                break;
            }
        }

        this.calcularProdutoMaisCaro();

        this.calcularProdutoMaisBarato();

    }

    private void calcularProdutoMaisCaro() {

        int indexProdutoMaisCaro = 0;

        for (int i = 0; i < this.qtdeProdutos; i++) {
            if (this.precosProdutos[i] > this.precosProdutos[indexProdutoMaisCaro]) {
                indexProdutoMaisCaro = i;
            }
        }

        //this.imprimeProduto(indexProdutoMaisCaro, "caro");
        this.imprimeProduto(indexProdutoMaisCaro, TipoPreco.CARO);

    }

    private void calcularProdutoMaisBarato() {

        int indexProdutoMaisBarato = 0;

        for (int i = 0; i < this.qtdeProdutos; i++) {
            if (this.precosProdutos[i] < this.precosProdutos[indexProdutoMaisBarato]) {
                indexProdutoMaisBarato = i;
            }
        }

        //this.imprimeProduto(indexProdutoMaisBarato, "barato");
        this.imprimeProduto(indexProdutoMaisBarato, TipoPreco.BARATO);
    }

//  private void imprimeProduto(int index, String texto) {
    private void imprimeProduto(int index, TipoPreco tipoPreco) {

        System.out.printf("Produto mais %s: %s - R$ %.2f \n",
                tipoPreco.name(),
                this.nomesProdutos[index],
                this.precosProdutos[index]);
    }

}


