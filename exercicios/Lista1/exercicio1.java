package pkg;

import java.util.Scanner;

class Ex1 {

	public static void main(String[] args) {
		double n1, n2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite n1: ");
		n1 = teclado.nextFloat();
		System.out.println("Digite n2: ");
		n2 = teclado.nextFloat();
		
		double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;
		
		System.out.println("Soma: "+soma);
		System.out.println("Soma: "+subtracao);
		System.out.println("Soma: "+multiplicacao);
		System.out.println("Soma: "+divisao);


	}

}
