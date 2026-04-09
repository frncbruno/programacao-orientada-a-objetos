public class Carro {

    // Atributos
    private String placa;
    private int numChassi;

    // Construtor
    public Carro(String placa, int numChassi) {
        this.placa = placa;
        this.numChassi = numChassi;
    }

    // Método acelerar
    public void acelerar() {
        System.out.println("O carro está acelerando...");
    }

    // Método frear
    public boolean frear() {
        System.out.println("O carro está freando...");
        return true;
    }

    // Getters e Setters (opcional, mas comum)
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }
}
