package br.com.letscode.turmaitau.operacoes;

    /*
        modificadores de acesso para classe
        default: dentro do pacote (operacoes)
        public: em qualquer parte do codigo
    */

public class Dividir {

    /*
        modificadores de acesso para metodos
        default: dentro do pacote (operacoes)
        private: dentro da própria classe
        public: em qualquer parte do codigo
        protected: apenas funciona com herança
     */
    public void realizarOperacao(double varnum1, double varnum2){
        System.out.printf("Resultado: %.2f / %.2f = %.2f %s", varnum1, varnum2, (varnum1/varnum2), "!" );
    }

}
