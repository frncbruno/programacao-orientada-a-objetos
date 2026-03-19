package pkg;

public class Main {

    public static void main(String[] args) {

        ContaCorrente novaConta = new ContaCorrente();
      
        novaConta.definirSaldoInicial(1000);
        System.out.println("Saldo: " + novaConta.saldo);

        if (novaConta.sacar(500)) {
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        novaConta.depositar(50);

        System.out.println("Saldo: " + novaConta.saldo);

        if (novaConta.sacar(600)) {
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println("Saldo final: " + novaConta.saldo);
    }
}
