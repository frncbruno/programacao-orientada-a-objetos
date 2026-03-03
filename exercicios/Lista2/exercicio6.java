package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero;

		do {
			System.out.print("Digite um número (0 para parar): ");
			numero = teclado.nextInt();
		} while (numero != 0);

		System.out.println("Programa encerrado!");

		teclado.close();
	}
}
