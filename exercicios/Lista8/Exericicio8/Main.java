package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Filme f1 = new Filme();
		
		System.out.println("Digite o titulo do filme: ");
		String titulo  = teclado.nextLine();
		System.out.println("Digite a classificacao etaria do filme: ");
		int cE = teclado.nextInt();
		System.out.println("Digite a duracao do filme");
		int duracao = teclado.nextInt();
		System.out.println("Digite a sua idade: ");
		int idade = teclado.nextInt();
		
		f1.valores(titulo, duracao, cE);
		f1.converterDuracaoHoras(duracao);
		f1.podeAssitir(idade);
		f1.descricaoFilme();
	}

}
