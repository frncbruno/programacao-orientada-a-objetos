package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Triangulo t = new Triangulo(); 
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor do lado A: ");
		t.setLadoA(teclado.nextDouble());

		System.out.println("Digite o valor do lado B: ");
		t.setLadoB(teclado.nextDouble());

		System.out.println("Digite o valor do lado C: ");
		t.setLadoC(teclado.nextDouble());

		if (t.verificaEquilatero()) {
			System.out.println("O triângulo é equilátero.");
		} else {
			System.out.println("O triângulo não é equilátero.");
		}

    }
}
