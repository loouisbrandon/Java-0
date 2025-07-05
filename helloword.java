public class helloword {

    //OBJETOS EXEMPLO
    // Define a classe Carro
public class Carro {
    // Atributos (características) do Carro
    String marca;
    String modelo;
    int ano;
    String cor;

    // Métodos (comportamentos) do Carro
    public void ligar() {
        System.out.println(marca + " " + modelo + " está ligado.");
    }

    public void acelerar() {
        System.out.println(marca + " " + modelo + " está acelerando.");
    }

    public void frear() {
        System.out.println(marca + " " + modelo + " está freando.");
    }

}
//1 o objeto MeuComputador 
//2 a classe é O computador
//3 o atributo é a caracteristica da classe
//4 o metodo é o comportamento da classe
}
public class Garagem {
    public static void main(String[] args) {
        // Criando o primeiro objeto Carro
        Carro meuCarro = new Carro(); // 'new Carro()' cria um novo objeto
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2023;
        meuCarro.cor = "Prata";

        System.out.println("Meu carro é um " + meuCarro.marca + " " + meuCarro.modelo + " " + meuCarro.cor + " de " + meuCarro.ano + ".");
        meuCarro.ligar();
        meuCarro.acelerar();

        System.out.println("--------------------");

        // Criando o segundo objeto Carro
        Carro carroDoVizinho = new Carro(); // Outro objeto, independente do primeiro
        carroDoVizinho.marca = "Honda";
        carroDoVizinho.modelo = "Civic";
        carroDoVizinho.ano = 2022;
        carroDoVizinho.cor = "Preto";

        System.out.println("O carro do vizinho é um " + carroDoVizinho.marca + " " + carroDoVizinho.modelo + " " + carroDoVizinho.cor + " de " + carroDoVizinho.ano + ".");
        carroDoVizinho.ligar();
        carroDoVizinho.frear();
    }
}

