import java.util.Scanner;

public class LocadoraVeiculos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Carro c = new Carro();
		
		c.atribuirValores("VW", "Gol");
		System.out.println("Dados do carro: "+c.retornaMarca()+" "+c.retornaModelo()+"");

	}

}
