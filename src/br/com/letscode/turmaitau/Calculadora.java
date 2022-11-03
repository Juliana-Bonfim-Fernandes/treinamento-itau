package br.com.letscode.turmaitau;

import java.util.Scanner;

// modelo do exercicio 1 - mais simples

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = entrada.nextDouble();

        System.out.println("Digite a operaçao: ");
        System.out.println("1 - somar; 2 - subtrair; 3 - dividir; 4 - multiplicar");
        int operacao1 = entrada.nextInt();

/*      Modelo 1 com if-else
        if (operacao1 == 1) {
            // printf formata os campos que serão apresentados
            System.out.printf("Resultado: %.2f + %.2f = %.2f %s ", num1, num2, (num1 + num2), "!");
        } else if (operacao1 == 2) {
            System.out.printf("Resultado: %.2f - %.2f = %.2f %s ", num1, num2, (num1 - num2), "!");
        } else if (operacao1 == 3) {
            System.out.printf("Resultado: %.2f / %.2f = %.2f %s ", num1, num2, (num1 / num2), "!");
        } else if (operacao1 == 4) {
            System.out.printf("Resultado: %.2f x %.2f = %.2f %s ", num1, num2, (num1 * num2), "!");
        }
*/
        // Modelo 2 com switch case
        switch (operacao1) {
            case 1:
                System.out.printf("Resultado: %.2f + %.2f = %.2f %s ", num1, num2, (num1 + num2), "!");
                // para sair do switch, para "e" - tira o break - "ou"
                break;
            case 2:
                System.out.printf("Resultado: %.2f - %.2f = %.2f %s ", num1, num2, (num1 - num2), "!");
                break;
            case 3:
                System.out.printf("Resultado: %.2f / %.2f = %.2f %s ", num1, num2, (num1 / num2), "!");
                break;
            case 4:
                System.out.printf("Resultado: %.2f x %.2f = %.2f %s ", num1, num2, (num1 * num2), "!");
                break;
            default:
                System.out.printf("operaçao invalida!");
                break;
        }


    }

}
