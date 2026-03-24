import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Digite um numero inteiro: ");

        if (teclado.hasNextInt()) {
            numero = teclado.nextInt();

            if (numero < 0) {
                System.out.println("Erro: nao existe raiz de numero negativo.");
            } else {
                double raiz = Math.sqrt(numero);
                System.out.println("A raiz quadrada de " + numero + " é " + raiz);
            }

        } else {
            System.out.println("Erro: voce nao digitou um numero inteiro valido.");
        }

        teclado.close();
    }
}
