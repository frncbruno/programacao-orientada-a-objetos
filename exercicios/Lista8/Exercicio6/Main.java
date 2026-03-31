package pkg;

public class Main {
    public static void main(String[] args) {
        Carro c = new Carro("Fusca Turbo", 20, 120);

        System.out.println("Carro: " + c.modelo);

        c.acelerar(50); 
        c.acelerar(100); 

        if (meuarro.atingiuVelocidadeMaxima()) {
            System.out.println("Atenção: Você está no limite do motor!");
        }

        c.calcularTempoViagem(240); 

        c.frear(150); /
    }
}
