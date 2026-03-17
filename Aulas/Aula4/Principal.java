package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		c.a = 4.37;
		c.b = 4.47;
		double resultado;
		resultado = c.somar();
		System.out.println("Resultado da soma: "+resultado);
		
//		Carro c = new Carro();
//		Scanner teclado = new Scanner (System.in);
//		
//		System.out.println("Digite a marca do carro: ");
//		c.marca = teclado.nextLine();
//		
//		System.out.println("Digite o modelo do carro: ");
//		c.modelo = teclado.nextLine();
//		
//		c.alugar();
//		c.devolver();
//		c.exibirDados();
//		

	}

}
