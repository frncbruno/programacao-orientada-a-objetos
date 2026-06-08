public class Moto extends Veiculo {

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    // Implementação do método acelerar para a moto [cite: 17, 76]
    @Override
    public void acelerar() {
        System.out.println("A moto " + modelo + " está acelerando: Randandan! Puxando o manete da direita.");
    }

    // Implementação do método frear para a moto [cite: 17, 76]
    @Override
    public void frear() {
        System.out.println("A moto " + modelo + " está freando: Reduzindo e acionando o freio dianteiro e o pedal traseiro.");
    }
}
