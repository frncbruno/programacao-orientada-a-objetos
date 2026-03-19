package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        System.out.println("-- Pessoa 1 --");
        System.out.print("Nome: ");
        p1.nome = teclado.nextLine();

        System.out.print("Email: ");
        p1.email = teclado.nextLine();

        System.out.print("Data de nascimento: ");
        p1.dataNascimento = teclado.nextLine();

        System.out.print("Endereço: ");
        p1.endereco = teclado.nextLine();

        System.out.println("\n-- Pessoa 2 --");
        System.out.print("Nome: ");
        p2.nome = teclado.nextLine();

        System.out.print("Email: ");
        p2.email = teclado.nextLine();

        System.out.print("Data de nascimento: ");
        p2.dataNascimento = teclado.nextLine();

        System.out.print("Endereço: ");
        p2.endereco = teclado.nextLine();

        p1.promoverAdmin();
        
        System.out.println("\n-- Resultado --");

        System.out.println("\nPessoa 1:");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Email: " + p1.retornaEmail());
        System.out.println("Admin: " + (p1.admin ? "Sim" : "Não"));

        System.out.println("\nPessoa 2:");
        System.out.println("Nome: " + p2.nome);
        System.out.println("Email: " + p2.retornaEmail());
        System.out.println("Admin: " + (p2.admin ? "Sim" : "Não"));

        teclado.close();
    }
}
