package pkg;

import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Arquivo arquivo = new Arquivo("alunos");
		int opcao;

		do {
			System.out.println("\n===== MENU ALUNOS =====");
			System.out.println("1 - Cadastrar aluno (escrever no alunos.txt)");
			System.out.println("2 - Listar alunos (ler do alunos.txt)");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opcao: ");

			// Garante que o usuário digite um número antes de continuar
			while (!scanner.hasNextInt()) {
				System.out.println("Opção inválida. Digite um número.");
				scanner.next();
				System.out.print("Escolha uma opcao: ");
			}

			opcao = scanner.nextInt();
			scanner.nextLine(); // limpa o "\n" que fica no buffer depois do nextInt()

			switch (opcao) {
				case 1:
					System.out.print("Nome do aluno: ");
					String nome = scanner.nextLine();

					System.out.print("Idade do aluno: ");
					int idade;
					try {
						idade = Integer.parseInt(scanner.nextLine().trim());
					} catch (NumberFormatException e) {
						System.out.println("Idade inválida. Cadastro cancelado.");
						break;
					}

					Aluno novoAluno = new Aluno(nome, idade);
					arquivo.gravaArquivo(novoAluno);
					break;

				case 2:
					List<Aluno> lista = arquivo.leArquivo();

					if (lista.isEmpty()) {
						System.out.println("Nenhum aluno cadastrado ainda.");
					} else {
						System.out.println("Alunos cadastrados:");
						for (Aluno a : lista) {
							System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade());
						}
					}
					break;

				case 0:
					System.out.println("Saindo...");
					break;

				default:
					System.out.println("Opção inválida!");
			}

		} while (opcao != 0);

		scanner.close();
	}
}
