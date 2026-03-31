package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Time t1 = new Time();
		
		t1.valores("Brasil", 0, 0);
		
		t1.marcarGol(2);
		t1.sofrerGol(0);
		
		t1.resultadoPartida();
	}

}
