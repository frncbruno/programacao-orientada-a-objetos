package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero;

		do {
			System.out.print("Digite o número da nota (-1 para parar): ");
			numero = teclado.nextInt();
		} while (numero != -1);

		System.out.println("Programa encerrado!");

		teclado.close();
	}
}
