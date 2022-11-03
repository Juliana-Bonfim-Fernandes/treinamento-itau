// pacote - diretório/pasta
package br.com.letscode.turmaitau;

// classe - arquivo
// padrão de nomenclatura: primeira letra em maiuscula
public class PrimeiraClasse {

    // método com argumento array de string - ponto de partida do programa - é obrigatório
    // método executável, porque tem o padrão: public static void (não retorna nada)
    // padrão de nomenclatura: primeira letra em minusculo
    public static void main(String[] args) {

        // padrão nomenclatura: mxxxxMxxxxx. Ex: nomeCliente

        char conversaoAsc = 97;
        System.out.println("byte 1 = " + conversaoAsc);

        byte nomeVariavelByte;
        nomeVariavelByte = 'a';

        System.out.println("byte 2 = " + nomeVariavelByte);

        // CAST - operação que converte o retorno da variavel
        byte conversao = 97;
        System.out.println("byte 3 = " + (char) conversao);

        // println = pula 1 linha após a escrita
        System.out.println("Hello Itau!");

        // print = não pula linha
        System.out.print("Hello Juliana!");

        // te ajuda a buscar os pontos do código com alguma pendencia / backlog de débito técnico, aparece na aba abaixo "TODO"
        // TODO : preciso rever essa parte
        // CTRL + espaço = alto completa com os metodos disponíveis

    }
}
