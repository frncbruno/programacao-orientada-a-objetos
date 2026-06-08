public class ContaCorrente extends Conta {

    // Construtor que repassa os valores para a classe pai (Conta)
    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("[Conta Corrente] Depósito de R$ " + valor + " realizado.");
        } else {
            System.out.println("[Conta Corrente] Valor de depósito inválido.");
        }
    }

    @Override
    public void sacar(double valor) {
        // Regra: Saldo disponível é o saldo real + o limite do cheque especial
        if (valor > 0 && valor <= (this.saldo + this.limite)) {
            this.saldo -= valor;
            System.out.println("[Conta Corrente] Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("[Conta Corrente] Erro: Saldo e limite insuficientes para o saque de R$ " + valor + ".");
        }
    }
}
