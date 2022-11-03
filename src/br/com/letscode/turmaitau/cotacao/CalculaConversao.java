package br.com.letscode.turmaitau.cotacao;

import java.util.Scanner;

public class CalculaConversao {
   public void recuperarDadosECalcular() {

        Double cotacaoDolar;
        Double vlrDolar;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a cotação do Dolar: ");
        cotacaoDolar = entrada.nextDouble();

        System.out.println("Informe o valor em Dólares que vc deseja converter para Reais: ");
        vlrDolar = entrada.nextDouble();

        this.calcularReais(cotacaoDolar, vlrDolar);
    }

    private void calcularReais(double vlrCotacao, double valor) {

        System.out.println("-> " + valor + " dolares corresponde a " + vlrCotacao * valor + " reais.");

   }
}