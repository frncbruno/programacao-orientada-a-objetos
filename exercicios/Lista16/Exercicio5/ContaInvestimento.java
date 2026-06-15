
public class ContaInvestimento extends Conta {
    
    public ContaInvestimento(double saldo) {
        super(saldo); 
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado na Conta Investimento.");
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado na Conta Investimento.");
    }

    public void atualizaRendimentos() {
        saldo += saldo * 0.05; 
        System.out.println("Rendimentos atualizados! Novo saldo: " + saldo);
    }
}

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado na Conta Poupança.");
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado na Conta Poupança.");
    }


    public void atualizaJuros() {
        saldo += saldo * 0.03;
        System.out.println("Juros atualizados! Novo saldo: " + saldo);
    }
}
