import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite um inteiro: ");
        a = teclado.nextInt();

        System.out.println("Digite um inteiro: ");
        b = teclado.nextInt();

        System.out.println("Digite um inteiro: ");
        c = teclado.nextInt();

        int maior, meio, menor;

        // Descobrindo o maior
        if (a >= b && a >= c) {
            maior = a;

            if (b >= c) {
                meio = b;
                menor = c;
            } else {
                meio = c;
                menor = b;
            }

        } else if (b >= a && b >= c) {
            maior = b;

            if (a >= c) {
                meio = a;
                menor = c;
            } else {
                meio = c;
                menor = a;
            }

        } else {
            maior = c;

            if (a >= b) {
                meio = a;
                menor = b;
            } else {
                meio = b;
                menor = a;
            }
        }

        System.out.println("Ordem decrescente:");
        System.out.println(maior);
        System.out.println(meio);
        System.out.println(menor);
    }
}
