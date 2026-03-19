package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha o construtor: 1 - Nome e Idade, 2 - Apenas Idade");
        int opcao = teclado.nextInt();
        teclado.nextLine(); 

        if (opcao == 1) {
            System.out.print("Digite o nome: ");
            String nome = teclado.nextLine();
            System.out.print("Digite a idade: ");
            int idade = teclado.nextInt();
            new Pessoa(nome, idade);
        } else {
            System.out.print("Digite a idade: ");
            int idade = teclado.nextInt();
            new Pessoa(idade);
        }

        teclado.close();
    }
}
