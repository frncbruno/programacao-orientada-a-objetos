package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] vetor = new int[5]; //int vetor[5];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o elemento "+i+":");
			vetor[i] = teclado.nextInt();
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Elemento "+i+" = "+vetor[i]);
		}

		teclado.close();
	}
}
