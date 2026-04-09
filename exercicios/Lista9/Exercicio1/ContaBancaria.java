public class ContaBancaria {
    private double saldo;
    private double limite;

    public ContaBancaria() {}

    public ContaBancaria(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void saque(double valor) {
        if (valor > limite) {
            System.out.println("Saque maior que o limite.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Você sacou " + valor + ". Novo saldo: " + saldo);
        }
    }
}
