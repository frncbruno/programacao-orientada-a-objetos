package pkg;

public class ReservaDeHotel extends Reserva {
    
    @Override
    public void cancelar() {
        System.out.println("Política de cancelamento para reserva de hotel: Cancelamento gratuito até 24 horas antes do check-in.");
    }
    
}
