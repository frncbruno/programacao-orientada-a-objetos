// 8) Crie uma classe Reserva com métodos para adicionar e cancelar reservas. 
// Derive classes como ReservaDeHotel e ReservaDeVoo da classe Reserva.
// • Sobrecarregue o método adicionar em ReservaDeVoo para aceitar 
// diferentes tipos de classes (econômica, executiva).
// • Sobrescreva o método cancelar em ambas as classes derivadas para 
// tratar políticas de cancelamento específicas.
// • Demonstre como criar e cancelar diferentes tipos de reservas usando 
// polimorfismo.



package pkg;

public class Main {

    public static void main(String[] args) {
        Reserva reservaHotel = new ReservaDeHotel();
        ReservaDeVoo reservaVoo = new ReservaDeVoo();

        System.out.println("Criando reserva de hotel...");
        reservaHotel.adicionar();

        System.out.println("Criando reserva de voo...");
        reservaVoo.adicionar("executiva");

        System.out.println("Cancelando reserva de hotel...");
        reservaHotel.cancelar();

        System.out.println("Cancelando reserva de voo...");
        reservaVoo.cancelar();
    }
}
