public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void depositar(Cheque cheque) {
        double valorCheque = cheque.getValor();
        if (valorCheque > 0) {
            saldo += valorCheque;
            System.out.println("Depósito de cheque no valor de R$ " + valorCheque + " realizado com sucesso.");
        } else {
            System.out.println("Valor do cheque inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
    
}
