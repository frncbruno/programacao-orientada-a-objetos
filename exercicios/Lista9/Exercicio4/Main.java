package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Carro c = new Carro(); 
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a marca do carro: ");
		c.setMarca(teclado.nextLine());

		System.out.println("Digite o modelo do carro: ");
		c.setModelo(teclado.nextLine());

		System.out.println("Digite o ano do carro: ");
		c.setAno(teclado.nextInt());

		c.exibeDetalhes();

    }
}
