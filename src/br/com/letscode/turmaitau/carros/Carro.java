package br.com.letscode.turmaitau.carros;

// toda classe criada no java é um objeto
// toda classe extende objeto

import java.util.Objects;

public class Carro {

     /* ATRIBUTOS
        modificadores
        public
        private - somente a própria classe pode manipular o atributo, precisa fazer o get e set para usar fora da classe
        protected
        default
     */

    // variavel static - reflete em toda classe - extrapola o objeto - pertence somente a classe
    // evitar utilizar classes, metodos e atributos estaticos. Se precisar, nunca utilizar com variaveis
    // que precisam ser usadas fora

    private String marca;           // String como tipo primitivo e não inicializa, o default é null
    private String modelo;
    private Integer anoFabricacao = null;   // Integer (classe) e não inicializa a variável, o defaut é null
    private String cor;
    private String placa;

    private boolean ligado;    // boolean o valor default é false
    private int velocidade;   // int - mesmo que não inicializou, o valor default sempre é 0


    // CONSTRUTORES - opções para quem utiliza a classe
    // sem parametro - padrão
    public Carro() {
    }

    /* com parametro - depende da modelagem da classe - pode ter vários esquemas de parametros.
       poderia ter um construtor somente com a placa ou marca e modelo */
    public Carro(String marca, String modelo, String placa, String cor, Integer anoFabricacao) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPlaca(placa);
        this.setCor(cor);
        this.setAnoFabricacao(anoFabricacao);
    }

    // carro zero - sem placa
    public Carro(String marca, String modelo, String cor, Integer anoFabricacao) {
        /*this.setMarca(marca);
        this.setModelo(modelo);
        this.setCor(cor);
        this.setAnoFabricacao(anoFabricao); */
        // reutiliza o construtor existente
        this(marca, modelo, " ", cor, anoFabricacao);
    }

    // carro zero - sem placa e sem cor
    public Carro(String marca, String modelo, Integer anoFabricacao) {
        // reutiliza o construtor existente
        this(marca, modelo, " ", " ", anoFabricacao);
    }

    // metodos = comportamentos

    void ligar() {
        this.velocidade = 0;
        this.ligado = true;
    }

    void desligar() {
        if (!ligado) {
            this.velocidade = 0;
            this.ligado = false;
        }
    }

    void acelerar() {
        this.velocidade = this.velocidade + 20;
    }

    void acelerarv(int velocidade) {

        if (ligado && velocidade <= 20) {
            this.velocidade = this.velocidade + velocidade;
        }
    }

    void imprimirtoString() {
        System.out.println("this = " + this.toString()); // utiliza a classe sobreescrita - imprime o conteúdo
        System.out.println("super = " + super.toString()); // utiliza a classe primitiva - imprime endereço de memória
    }

    // to e aparece String (generate to wizard...)
    // substituindo a classe pai (nativo) toString, por isso a anotação de @Override
    // sobreescrever o método é chamado de herança
    // pode sobrescrever se o metodo primitivo for public ou protected
    // mostra o estado do seu objeto em formato string
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carro{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", anoFabricação=").append(anoFabricacao);
        sb.append(", cor='").append(cor).append('\'');
        sb.append(", placa='").append(placa).append('\'');
        sb.append(", ligado=").append(ligado);
        sb.append(", velocidade=").append(velocidade);
        sb.append('}');
        return sb.toString();
    }

    // para comparação dos estados entre 2 objetos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;  // cast para Carro
        return Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && Objects.equals(anoFabricacao, carro.anoFabricacao) && Objects.equals(cor, carro.cor) && Objects.equals(placa, carro.placa);
    }

    // se não sobreescrever esse metodo, é pego numero de memória
    // mostra o estado do seu objeto em hash
    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, anoFabricacao, cor, placa);
    }

    // botão direito - clica em Genarate e cria automatico os metodos get e set
    public String getCor(){
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setCor(String Cor) {
        if (cor == null) {
            cor = " ";
        }
        this.cor = cor.toUpperCase();
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        if (anoFabricacao != null && anoFabricacao > 1950) {
            this.anoFabricacao = anoFabricacao;
        }
    }

    public void setPlaca(String placa) {
        if (placa != null && placa.length() >= 7) {
            this.placa = placa;
        }
    }
}
