// A classe estende Conta, tornando-se uma subclasse concreta
public class ContaCorrente extends Conta {

    // Construtor que repassa os valores para o construtor da classe pai (Conta)
    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    // Implementação obrigatória do método abstrato depositar
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Implementação obrigatória do método abstrato sacar
    @Override
    public void sacar(double valor) {
        // Permite sacar se o valor estiver dentro do saldo + limite disponível
        if (valor > 0 && valor <= (this.saldo + this.limite)) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
}
