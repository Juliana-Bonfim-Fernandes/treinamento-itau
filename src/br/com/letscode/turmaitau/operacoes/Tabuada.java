package br.com.letscode.turmaitau.operacoes;

public class Tabuada {

    public void realizarOperacao(double multiplicando, double limite){

        // instancia fora para não instanciar a cada execução do for - p/ performance
        Multiplicar multiplicar = new Multiplicar();
        // ou pode ser var multiplicar = new Multiplicar();

        // for - quando vc sabe quando irá parar - sequencia controlada
        for (double i = 0; i <= limite ; i++) {
            //System.out.printf("Resultado: %.2f x %.2f = %.2f %s \n", multiplicando, i, (multiplicando * i), "!" );
            multiplicar.realizarOperacao(multiplicando, i);
        }

        // Dica: Shift + F6 - muda o nome de todas as variaveis

        /*
        while - quando vc não sabe quando irá parar
        int i = 0;
        while (i <= limite) {
            System.out.printf("Resultado: %.2f x %.2f = %.2f %s", multiplicando, i, (multiplicando * i), "!" );
            i++;
            ou i = i + 1;
        } */
    }
}
