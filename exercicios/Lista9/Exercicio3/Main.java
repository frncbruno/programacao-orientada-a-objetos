package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Retangulo r = new Retangulo(); 
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a base do retângulo: ");
		r.setBase(teclado.nextDouble());

		System.out.println("Digite a altura do retângulo: ");
		r.setAltura(teclado.nextDouble());

		double area = r.calculaArea();
		System.out.println("A área do retângulo é: " + area);

		teclado.close();

    }
}
