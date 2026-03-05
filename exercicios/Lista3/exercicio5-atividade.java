package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int[] n = new int[10]; 
		int maior = n[0];
		int menor = n[0];
		
		for (int i = 0; i < n.length; i++) {
			System.out.print("Digite o número " + (i+1) + ": ");
            n[i] = teclado.nextInt();
		
		if (menor > n[i]) {
			menor = n[i];
		} else if (maior < n[i]) { 
			maior = n[i];
		}
		}
		
		System.out.println("Menor: " + menor);
		System.out.println("Maior: "+maior);
		
		teclado.close();
	}
}
