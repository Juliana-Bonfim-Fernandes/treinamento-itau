package br.com.letscode.turmaitau.gastocombustivel;

import java.util.Scanner;

public class GastoCombustivelMain {

    public static float KM_LITRO = 12;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o tempo gasto na viagem em horas:");
        float tempo = entrada.nextFloat();

        System.out.println("Informe a velocidade média da viagem em km/h:");
        float velocidade = entrada.nextFloat();

        float distanciaCalculada = calculaDistanciaPercorrida (tempo,velocidade);

        float consumoViagem = calculaConsumoCombustivel(distanciaCalculada, KM_LITRO);

        System.out.println("Velocidade média da viagem: "+velocidade+" km/h");
        System.out.println("Tempo gasto: "+tempo+" h");
        System.out.println("Distância percorrida: "+distanciaCalculada+" km");
        System.out.println("Combustível gasto: "+consumoViagem+" litros");

    }

    public static float calculaDistanciaPercorrida (float tempo, float velocidade){
        float distanciaPercorrida = tempo * velocidade;
        return distanciaPercorrida;
    }

    public static float calculaConsumoCombustivel (float distancia, float consumoMedio){
        float consumoViagem = distancia / consumoMedio;
        return consumoViagem;
    }
}
