package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma mensagem: ");
        String mensagem = scanner.nextLine();
        System.out.print("Digite o número de repetições: ");
        int repeticoes = scanner.nextInt();

        pessoa.falar(mensagem);
        pessoa.falar(mensagem, repeticoes);


    }
}
