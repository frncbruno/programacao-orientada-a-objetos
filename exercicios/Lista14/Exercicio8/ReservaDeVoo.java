package pkg;

public class ReservaDeVoo extends Reserva {
    
    public void adicionar(String classe) {
        if (classe.equalsIgnoreCase("econômica")) {
            System.out.println("Reserva de voo econômica adicionada.");
        } else if (classe.equalsIgnoreCase("executiva")) {
            System.out.println("Reserva de voo executiva adicionada.");
        } else {
            System.out.println("Classe de voo inválida.");
        }
    }

    @Override
    public void cancelar() {
        System.out.println("Política de cancelamento para reserva de voo aplicada.");
    }
    
}
