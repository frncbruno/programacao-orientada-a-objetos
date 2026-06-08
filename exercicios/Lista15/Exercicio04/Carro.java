public class Carro extends Veiculo {

    // O construtor usa o super() para repassar os dados ao construtor da classe pai [cite: 387]
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    // Implementação do método acelerar para o carro [cite: 17, 76]
    @Override
    public void acelerar() {
        System.out.println("O carro " + modelo + " está acelerando: Vrummm! Pisando no pedal de acelerador.");
    }

    // Implementação do método frear para o carro [cite: 17, 76]
    @Override
    public void frear() {
        System.out.println("O carro " + modelo + " está freando: Ruuuuish! Acionando o freio ABS nas quatro rodas.");
    }
}
