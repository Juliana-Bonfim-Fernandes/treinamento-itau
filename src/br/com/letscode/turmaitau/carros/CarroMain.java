package br.com.letscode.turmaitau.carros;

public class CarroMain {

    public static void main(String[] args) {

        Carro audi = new Carro();
        audi.setModelo("A1");
        audi.setMarca("Audi");
        audi.setCor("Branco");
        audi.setAnoFabricacao(2020);
        audi.setPlaca("XYZ12345");

        audi.ligar();
        audi.acelerar();
        audi.acelerar();

  /*      Carro nissan = new Carro();
        nissan.modelo = "March";
        nissan.marca = "Nissan";
        nissan.cor = "Preto";
        nissan.anoFabricacao = 2021;
        nissan.placa = "ABC12345";
        nissan.acelerar();
        nissan.acelerar();

        System.out.println("audi = " + audi.modelo);
        System.out.println("nissan = " + nissan.modelo);

        audi.modelo = "A2";
        nissan.modelo = "Versa";

        System.out.println("audi = " + audi.modelo);
        System.out.println("nissan = " + nissan.modelo);

        // antes utilizando o metodo toString nativo
        //System.out.println("audi = " + audi);  // exibe br.com.letscode.turmaitau.carros.Carro@4c873330 - posição da memória
        //System.out.println("nissan = " + nissan); // exibe br.com.letscode.turmaitau.carros.Carro@119d7047 - posição da memória

        // após o metodo toString na classe Carro, é exibido o conteudo do objeto
        System.out.println("audi = " + audi.toString());
        System.out.println("nissan = " + nissan.toString());
        // pode incluir ou não o toString()

        System.out.println( "audi = nissan?" + nissan.equals(audi) );


        //        String modeloAudi = "Audi";
        //        String modeloNissan = "Audi";
        //       System.out.println( "audi = nissan? " + (modeloAudi == modeloNissan) );
        //        System.out.println( "audi = nissan? " + (modeloAudi.equals(modeloNissan)) );

        // == compara valor
        // equal compara objeto

        audi.imprimirtoString();
        nissan.imprimirtoString();


        Carro golBranco = new Carro();
        golBranco.modelo = "Gol";

        Carro golPreto = new Carro();
        golPreto.modelo = "Gol";

        // para comparar objetos deve-se usar equals e não == (erro gravissimo! porque cada hora dar um erro)
        // para comparar com == apenas com primitivo (int,... que não é uma classe)

        System.out.println("modelo golBranco = golPreto? " + (golPreto.equals(golBranco)));
        System.out.println("modelo golBranco = golPreto? " + (golPreto.modelo == golBranco.modelo));

        Integer i1 = 1;
        Integer ii1 = new Integer ("1");

        System.out.println("i1 = " + i1);
        System.out.println("ii1 = " + ii1);
        System.out.println("objetos == " + (ii1.equals(i1))); // comparando objetos deve ser utilizado equals
        System.out.println("primitivo ==" + (ii1.intValue() == i1.intValue()));  // transformando em primitivo pode usar ==

        golBranco.imprimirtoString();
        golPreto.imprimirtoString();

        if (golPreto.equals(golBranco)) {
            System.out.println("comparação de objetos (equals) - são iguais");
        }else {
            System.out.println("comparação de objetos (equals) - são diferentes");
        }

        if (golPreto == golBranco) {   //CUIDADO!!! comparação de referencia de memoria
            System.out.println("comparação de memória (==) - são iguais");
        }else {
            System.out.println("comparação de memória (==) - são diferentes");
        }

        if (golPreto.toString().equals(golBranco.toString())) {
            System.out.println("comparação de toString (equals) - são iguais");
        }else {
            System.out.println("comparação de toString (equals) - são diferentes");
        }

        if (golPreto.hashCode() == golBranco.hashCode()) {
            System.out.println("comparação de hashcode (==) - são iguais");
        }else {
            System.out.println("comparação de hashcode (==) - são diferentes");
        }

        if ( golBranco instanceof Carro) {
            System.out.println("golBranco é um Carro! ");
        }

        if ( golPreto instanceof Carro) {
            System.out.println("golBranco é um Carro! ");
        }

        if ( golBranco instanceof Object) {
            System.out.println("golBranco é um Object! ");
        }
*/
    }
}
