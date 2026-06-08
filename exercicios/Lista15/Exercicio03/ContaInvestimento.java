public class ContaInvestimento extends Conta {

    // Construtor: o limite para conta investimento sempre será 0
    public ContaInvestimento(double saldo) {
        super(saldo, 0.0); 
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            // Regra especial: ganha 1% de bônus/rendimento no depósito
            double rendimento = valor * 0.01;
            this.saldo += (valor + rendimento);
            System.out.println("[Conta Investimento] Depósito de R$ " + valor + " realizado (Rendimento bônus de R$ " + rendimento + " aplicado!).");
        } else {
            System.out.println("[Conta Investimento] Valor de depósito inválido.");
        }
    }

    @Override
    public void sacar(double valor) {
        // Regra: Não usa limite, o saque só pode ser feito se houver saldo real
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("[Conta Investimento] Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("[Conta Investimento] Erro: Saldo insuficiente. Você não possui limite de cheque especial nesta conta.");
        }
    }
}
