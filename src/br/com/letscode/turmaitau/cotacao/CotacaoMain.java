package br.com.letscode.turmaitau.cotacao;

import br.com.letscode.turmaitau.cestaprodutos.CalculaCestaProdutos;

public class CotacaoMain {

    public static void main(String[] args) {

        CalculaConversao calculaConversao = new CalculaConversao();

        calculaConversao.recuperarDadosECalcular();
    }
}
