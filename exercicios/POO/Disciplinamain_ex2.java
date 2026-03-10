package pkg;

import java.util.Scanner;

public class Disciplina {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("-- Disciplina --");
		
		Professor p1 = new Professor();
		System.out.println("Digite o nome do professor: ");
		p1.nome = teclado.nextLine();
		
		Laboratorio l1 = new Laboratorio();
		System.out.println("Digite o local: ");
		l1.local = teclado.nextLine();
		
		System.out.println("Nome do professor: "+p1.nome);
		System.out.println("Local: "+l1.local);
	}

}
