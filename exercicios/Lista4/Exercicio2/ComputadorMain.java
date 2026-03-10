package projeto;

import java.util.Scanner;

public class ComputadorMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Computador c1 = new Computador();
		Computador c2 = new Computador();
		
		c2.marca = "Dell";
		c2.modelo = "Vision";
		c2.tipo = "Notebook";
		c2.preco = 3200;
		
		System.out.println("-- Computador 1 --");
		System.out.println("Digite o nome da marca: ");
		c1.marca = teclado.nextLine();
		
		System.out.println("Digite o nome do modelo: ");
		c1.modelo = teclado.nextLine();
		
		System.out.println("Digite o nome do tipo (notebook, desktop...): ");
		c1.tipo = teclado.nextLine();
		
		System.out.println("Digite o preço: ");
		c1.preco = teclado.nextDouble();

		System.out.println("Marca 1: "+c1.marca);
		System.out.println("Modelo 1: "+c1.modelo);
		System.out.println("Tipo 1: "+c1.tipo);
		System.out.println("Preço 1: "+c1.preco);
		
		System.out.println("Marca 2: "+c2.marca);
		System.out.println("Modelo 2: "+c2.modelo);
		System.out.println("Tipo: "+c2.tipo);
		System.out.println("Preço: "+c2.preco);
		
		
		
	}

}
