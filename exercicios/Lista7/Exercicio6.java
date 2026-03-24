import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double premio = 5000.0;
        int pessoas;
        double valorPorPessoa;

        try {
            System.out.print("Digite o numero de ganhadores: ");
            pessoas = teclado.nextInt();

            valorPorPessoa = premio / pessoas;

            System.out.println("Cada pessoa recebera: " + valorPorPessoa);

        } catch (ArithmeticException e) {
            System.out.println("Erro: nao pode dividir por zero.");

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um numero inteiro valido.");
        }

        teclado.close();
    }
}
