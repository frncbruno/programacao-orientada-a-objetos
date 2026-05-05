package pkg;

import java.util.Scanner;

class Principal {

	public static void main(String[] args) {
		Pessoa pessoa;
		System.out.println("Digite 1 para pessoa");
		System.out.println("Digite 2 para programador");
		
		Scanner teclado = new Scanner(System.in);
		
		int op = teclado.nextInt();
		if(op == 1) {
			pessoa = new Pessoa();
			pessoa.trabalhar();
		} else if (op == 2) {
			pessoa = new Programador();
			pessoa.trabalhar();
		}
	}

}
