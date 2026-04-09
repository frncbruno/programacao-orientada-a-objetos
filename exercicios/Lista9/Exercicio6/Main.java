package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Pessoa p = new Pessoa(); 
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o nome: ");
		p.setNome(teclado.nextLine());

		System.out.println("Digite a idade: ");
		p.setIdade(teclado.nextInt());

		System.out.println("Digite o cpf: ");
		p.setCpf(teclado.next());

		System.out.println("Nome: " + p.getNome());
		System.out.println("Idade: " + p.getIdade());
		System.out.println("CPF: " + p.getCpf());
		if (p.verificaMaiorDeIdade()) {
			System.out.println("A pessoa é maior de idade.");
		} else {
			System.out.println("A pessoa é menor de idade.");
		}
	}
}
