package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

//		Scanner teclado = new Scanner(System.in);
//
//		int n = teclado.nextInt();
//		System.out.println("Int digitado: " + n);
//
//		double n1 = teclado.nextDouble();
//		System.out.println("Double digitado: " + n1);
//
//		teclado.nextLine(); // limpa o ENTER pendente
//
//		String palavra = teclado.nextLine(); //Pega a linha toda
//		System.out.println("Palavra digitada: " + palavra);
//
//		palavra = teclado.next(); //Pega a primeira palavra da linha
//		System.out.println("Palavra digitada: " + palavra);
//
//		teclado.close();
		
		for (int i = 0; i < 10; i++) {
			//o i existirá somente aqui dentro
			System.out.println("I vale: "+i);
		}
		
		int i = 0;
		while (i < 10) {
			System.out.println("I vale com while: "+i);
		}
		
		i = 0;
		do { 
			System.out.println("I vale com do while: "+i);
		}while(i < 10);
	}
}
