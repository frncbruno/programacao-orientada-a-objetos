package pkg;

import java.util.Scanner;

class Principal {

	public static void main(String[] args) {
		FormaGeometrica fg = new FormaGeometrica();
		Triangulo t = new Triangulo();
		
		double areafg = fg.calcularArea(5, 4);
		double areat = t.calcularArea(7, 4);
		
		System.out.println("Área FG: "+areafg);
		System.out.println("Área FT: "+areat);
	}

}
