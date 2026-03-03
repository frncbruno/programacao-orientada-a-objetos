package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double n;
		double soma = 0;
		int contador = 0;

		System.out.print("Digite um número (0 para parar): ");
		n = teclado.nextDouble();
		
		while (n != 0) {

			soma += n;
			contador++;

			System.out.print("Digite um número (0 para parar): ");
			n = teclado.nextDouble();
		}
		
		double media = soma / contador;
		System.out.println("Media: "+media);

		teclado.close();
	}
}
