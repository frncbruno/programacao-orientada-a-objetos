package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Livro l = new Livro();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("-- Livro --");
		System.out.println("Titulo: ");
		l.titulo = teclado.nextLine();
		
		System.out.println("Autor: ");
		l.autor = teclado.nextLine();
		
		System.out.println("Ano de publicação: ");
		l.anoPublicacao = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Gênero: ");
		l.genero = teclado.nextLine();
		
		System.out.println("Você deseja ? (s/n): ");
		String resposta = teclado.nextLine();

		l.emprestado = false; // estado inicial
		l.verificarEstado(teclado);
        
        System.out.println("\n-- Estado final --");
        System.out.println("Titulo: "+l.titulo);
        System.out.println("Autor: "+l.autor);
        System.out.println("Ano de publicação: "+l.anoPublicacao);
        System.out.println("Gênero: "+l.genero);
        if (l.emprestado) {
            System.out.println("Emprestado: Sim");
        } else {
            System.out.println("Emprestado: Não");
        }
        
        teclado.close();
	}

}
