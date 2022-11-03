package br.com.letscode.turmaitau.carros;

public class CarroMain2 {

    public static void main(String[] args) {

        Carro audi = new Carro();
        audi.setModelo("A1");
        audi.setMarca("Audi");
        audi.setCor("Branco");
        audi.setAnoFabricacao(2020);
        audi.setPlaca("XYZ12345");

        audi.ligar();
        audi.acelerarv(10);
        audi.acelerarv(15);

        System.out.println("audi = " + audi);

        audi.desligar();

        System.out.println("audi = " + audi);

        Carro nissan = new Carro(
                "Nissan",
                "Versa",
                "ABC1234",
                "Cinza",
                2020
        );

        nissan.ligar();
        nissan.acelerarv(10);

        System.out.println("nissan = " + nissan);

        nissan.desligar();

        Carro gol = new Carro(
                "Gol",
                "Preto",
                2022
        );
    }
}
