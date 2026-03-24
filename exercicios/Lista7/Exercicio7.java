// InputMismatchException: ocorre quando o tempo digitado está errado (digita letra quando pede número)
// ArithmeticException: ocorre em erros de matemática (divisão por zero)

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            // Teste com InputMismatchException
            System.out.print("Digite um numero inteiro: ");
            int numero = teclado.nextInt();

            // Teste com ArithmeticException
            int resultado = 10 / numero;

            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Erro: voce nao digitou um numero inteiro.");

        } catch (ArithmeticException e) {
            System.out.println("Erro: divisao por zero.");
        }

        teclado.close();
    }
}
