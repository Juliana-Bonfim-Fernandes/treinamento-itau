package br.com.letscode.turmaitau.operacoes;

public class Multiplicar {

    // variáveis

    // construtor
    // se tirar o public, vira default - só quem está no pacote consegue acessar
    // private - só acessa dentro da classe

    public Multiplicar () {
        System.out.println("Inicialização do método Multiplicar");
    }

    /*
        modificadores de acesso de metodos
        default: dentro do pacote (operacoes)
        private: dentro da propria classe
        public: em qualquer parte do código
        protected: apenas funciona com herança
     */


    public void realizarOperacao(double numero1, double numero2){
        System.out.printf("Resultado: %.2f x %.2f = %.2f %s \n", numero1, numero2, (numero1 * numero2), "!" );
    }
}
