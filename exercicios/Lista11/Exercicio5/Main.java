// Crie uma classe ContaBancaria com um método depositar(double valor) que adiciona o valor 
// passado como parâmetro ao saldo da conta. Sobrecarregue o método depositar() para aceitar um 
// objeto Cheque e adicionar o valor do cheque ao saldo da conta.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor a ser depositado: ");
        double valor = scanner.nextDouble();
        conta.depositar(valor);

        System.out.print("Digite o valor do cheque a ser depositado: ");
        double valorCheque = scanner.nextDouble();
        Cheque cheque = new Cheque(valorCheque);
        conta.depositar(cheque);

        System.out.println("Saldo atual da conta: " + conta.getSaldo());

        scanner.close();
    }
}
