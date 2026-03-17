import java.util.Scanner;

public class LocadoraVeiculos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Carro c = new Carro("VW", "Gol");
		
		System.out.println("Marca do carro: "+c.marca);
		System.out.println("Modelo do carro: "+c.modelo);
		
		//ALTERNATIVA 2
		
		String marca, modelo; 
		
		System.out.println("Digite a marca do carro: ");
		marca = teclado.nextLine();
		
		System.out.println("Digite o modelo do carro: ");
		modelo = teclado.nextLine();
		Carro c2 = new Carro(marca, modelo);
		
		System.out.println("Marca do carro 2: "+c2.marca);
		System.out.println("Modelo do carro 2: "+c2.modelo);
		
		//ALTERNATIVA 3
		
		System.out.println("Digite a marca e modelo do carro: ");
		
		Carro c3 = new Carro(teclado.nextLine(), teclado.nextLine());
		
		System.out.println("Marca do carro 3: "+c3.marca);
		System.out.println("Modelo do carro 3: "+c3.modelo);
		
		//ALTERNATIVA 4
		
		Carro c4 = new Carro("Ford");
		
		System.out.println("Marca do carrro 4: "+c4.marca);
	}

}
