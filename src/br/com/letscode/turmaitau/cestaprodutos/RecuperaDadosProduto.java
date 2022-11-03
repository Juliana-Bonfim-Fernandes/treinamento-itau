package br.com.letscode.turmaitau.cestaprodutos;

import java.util.Scanner;

public class RecuperaDadosProduto {

    // variáveis
    public Scanner entrada;

    // construtor - obrigatorio o envio do scanner
    public RecuperaDadosProduto(Scanner entrada) {
        this.entrada = entrada;
    }

    public String recuperaNome() {
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = entrada.next();
        return nomeProduto;
    }

    public Double recuperaPreco() {
        System.out.println("Digite o valor do produto: ");
        Double valorProduto = entrada.nextDouble();
        return valorProduto;
    }

}
