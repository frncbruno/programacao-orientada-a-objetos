import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ContaBancaria cb = new ContaBancaria();

        System.out.print("Saldo da conta: ");
        cb.setSaldo(teclado.nextDouble());

        System.out.print("Limite: ");
        cb.setLimite(teclado.nextDouble());

        System.out.print("Valor do saque: ");
        double valor = teclado.nextDouble();

        cb.saque(valor);
    }
}
