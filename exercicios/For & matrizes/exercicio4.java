package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int [2][2];
		for (int i = 0; i < 2; i++) {
			for(int j = 0; j <2; j++) {
				System.out.println("Digite o elemento ["+i+"]["+j+"]:");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		System.out.println("Matriz digitada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Elemento ["+i+"]["+j+"]: "+matriz[i][j]);
            }
         }
		teclado.close();
	}
}
