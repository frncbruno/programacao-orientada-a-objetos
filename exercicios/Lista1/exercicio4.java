package pkg;

import java.util.Scanner;

class Ex1 {

	public static void main(String[] args) {
		
		/*
		 * Quadrante I: (x, y) são ambas positivas. 
		 * Quadrante II: (x, y) são x negativa e y positiva. 
		 * Quadrante III: (x, y) são ambas negativas. 
		 * Quadrante IV: (x, y) são x positiva e y negativa.
		 */
	
		int x, y;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite x: ");
		x = teclado.nextInt();
		
		System.out.println("Digite y: ");
		y = teclado.nextInt();
		
		if (x > 0 && y > 0) { 
			System.out.println("Quadrante 1");
		} else if (x < 0 && y > 0) { 
			System.out.println("Quadrante 2");
		} else if (x < 0 && y < 0) {
			System.out.println("Quadrante 3");
		} else if (x > 0 && y < 0) {
			System.out.println("Quadrante 4");
		} else {
			System.out.println("Sob o eixo");
		}

		
	}

}
