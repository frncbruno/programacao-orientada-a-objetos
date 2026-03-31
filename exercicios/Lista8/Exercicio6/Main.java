package pkg;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fusca Turbo", 20, 120);

        System.out.println("Carro: " + meuCarro.modelo);

        meuCarro.acelerar(50); 
        meuCarro.acelerar(100); 

        if (meuCarro.atingiuVelocidadeMaxima()) {
            System.out.println("Atenção: Você está no limite do motor!");
        }

        meuCarro.calcularTempoViagem(240); 

        meuCarro.frear(150); /
    }
}
