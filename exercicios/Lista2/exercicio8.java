package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String cidade;

		do {
			System.out.print("Digite cidades (caso digite 'São Paulo' irá parar): ");
			cidade = teclado.nextLine();
		} while (!cidade.equals("São Paulo"));

		System.out.println("Programa encerrado!");

		teclado.close();
	}
}
