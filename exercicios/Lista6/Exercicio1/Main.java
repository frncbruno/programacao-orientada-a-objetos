import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Disciplina d = new Disciplina();
		
		System.out.println("-- Conteúdo original --");
		d.exibirDados();
		
		System.out.println("-- Preencha abaixo --");

		System.out.println("Digite o nome da disciplina: ");
		d.nome = teclado.nextLine();
		
		System.out.println("Digite a carga horária: ");
		d.cargaHoraria = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Digite o nome do professor: ");
		d.nomeProfessor = teclado.nextLine();
		
		d.exibirDados();

	}

}
