public class Carro {
    // - = private, só a própria classe acessa
    // + = public, qualquer classe pode acessar
    // # = protected
    // ~ = default, package-private
    
    private String placa;
    private int numChassi;
    
    public Carro(String placa, int numChassi) {
        this.placa = placa;
        this.numChassi = numChassi;
    }

    public void acelerar() {
        System.out.println("O carro está acelerando...");
    }

    public boolean frear() {
        System.out.println("O carro está freando...");
        return true;
    }

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
