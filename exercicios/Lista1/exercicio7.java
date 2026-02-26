import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite um inteiro: ");
        n1 = teclado.nextInt();

        System.out.println("Digite um inteiro: ");
        n2 = teclado.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println(n1 + " é múltiplo de " + n2 + " e vice-versa");
        } else {
            System.out.println(n1 + " não é múltiplo de " + n2);
        }

    } 

} 
