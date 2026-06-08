public class Principal {
    public static void main(String[] args) {
        System.out.println("--- TESTANDO CONTA CORRENTE ---");
        // Criando Conta Corrente com R$ 100 de saldo e R$ 200 de limite
        Conta cc = new ContaCorrente(100.0, 200.0);
        System.out.println("Saldo Inicial CC: R$ " + cc.getSaldo());
        
        cc.depositar(50.0);
        System.out.println("Saldo Atual CC: R$ " + cc.getSaldo());
        
        // Tentando sacar R$ 250 (Usa R$ 150 do saldo + R$ 100 do limite)
        cc.sacar(250.0);
        System.out.println("Saldo Atual CC: R$ " + cc.getSaldo());
        
        // Tentando sacar além do limite disponível
        cc.sacar(500.0);

        System.out.println("\n--- TESTANDO CONTA INVESTIMENTO ---");
        // Criando Conta Investimento com R$ 500 de saldo inicial
        Conta ci = new ContaInvestimento(500.0);
        System.out.println("Saldo Inicial CI: R$ " + ci.getSaldo());
        
        // Depositando R$ 1000 (Deve render + R$ 10 de bônus)
        ci.depositar(1000.0);
        System.out.println("Saldo Atual CI: R$ " + ci.getSaldo());
        
        // Sacando dentro do saldo disponível
        ci.sacar(300.0);
        System.out.println("Saldo Atual CI: R$ " + ci.getSaldo());
        
        // Tentando forçar um saque usando limite (que é 0)
        ci.sacar(1300.0);
    }
}
