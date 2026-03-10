package pkg;

import java.util.Scanner;
import pkg.Carro;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("-- Carro --");
		
		Carro c1 = new Carro();
		System.out.println("Digite o nome da marca: ");
		c1.marca = teclado.nextLine();
		
		System.out.println("Digite o nome do modelo: ");
		c1.modelo = teclado.nextLine();
		
		System.out.println("Digite o ano de fabricação: ");
		c1.anoFabricacao = teclado.nextInt();
	
		
		System.out.println("Nome da marca: "+c1.marca);
		System.out.println("Modelo: "+c1.modelo);
		System.out.println("Ano de fabricação: "+c1.anoFabricacao);
	}

}
