package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double[] notas = new double[5]; //int vetor[5];
		double soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
            soma += notas[i]; // somando as notas para calcular a média depois
		}
		
		teclado.close();
		
        double media = soma / notas.length;
        
        System.out.printf("A média das notas é: %.2f%n", media);
	}
}
