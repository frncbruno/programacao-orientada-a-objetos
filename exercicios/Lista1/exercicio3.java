package pkg;

import java.util.Scanner;

class Ex1 {

	public static void main(String[] args) {
		double n1, n2, n3, n4;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite n1: ");
		n1 = teclado.nextDouble();
		
		System.out.println("Digite n2: ");
		n2 = teclado.nextDouble();
		
		System.out.println("Digite n3: ");
		n3 = teclado.nextDouble();
		
		System.out.println("Digite n4: ");
		n4 = teclado.nextDouble();
		
		double media = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("Média: "+media);
		if (n1 > media) { 
			System.out.println(""+n1+" é maior que a média");
		}
		if (n2 > media) { 
			System.out.println(""+n2+" é maior que a média");
		}
		if (n3 > media) { 
			System.out.println(""+n3+" é maior que a média");
		}
		if (n4 > media) { 
			System.out.println(""+n4+" é maior que a média");
		}
		
	}

}
