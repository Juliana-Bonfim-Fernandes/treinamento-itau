package br.com.letscode.turmaitau;

import br.com.letscode.turmaitau.operacoes.Tabuada;

import java.util.Scanner;

public class TabuadaMain {

    public static void main(String[] args) {
        //realiza as minhas operações da calculadora - aciona as classes

        // quando instancia uma classe, cria um objeto
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero da tabuada:");
        double numerador = entrada.nextDouble();

        System.out.println("Digite o número limite da tabuada:");
        double limitemultiplicador = entrada.nextDouble();

        new Tabuada().realizarOperacao(numerador, limitemultiplicador);

    }
}
