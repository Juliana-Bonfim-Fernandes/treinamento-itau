package br.com.letscode.turmaitau;

import br.com.letscode.turmaitau.operacoes.*;

import java.util.Scanner;

public class CalculadoraMain {

        public static void main(String[] args) {
            //realiza as minhas operações da calculadora - aciona as classes

            // quando instancia uma classe, cria um objeto
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite um numero:");
            double numero1 = entrada.nextDouble();

            System.out.println("Digite outro numero:");
            double numero2 = entrada.nextDouble();

            System.out.println("Digite a operação:");
            System.out.println("+ somar; - subtrair; * multiplicar; / dividir; t tabuada");
            String operador = entrada.next();

            switch (operador) {
                case "/":
                    new Dividir().realizarOperacao(numero1, numero2);
                    // também pode ser assim:
                    // Dividir dividir = new Dividir();
                    // dividir.realizarOperacao(numero1, numero2);
                    break;

                case "t":
                    new Tabuada().realizarOperacao(numero1, numero2);
                    break;

                case "+":
                    new Somar().realizarOperacao(numero1, numero2);
                    break;

                case "-":
                    new Subtrair().realizarOperacao(numero1, numero2);
                    break;

                case "x":
                    new Multiplicar().realizarOperacao(numero1, numero2);
                    break;

                default:
                    // printf - formata o conteúdo
                    System.out.printf("operador invalido");
                    break;
            }

        }
}
