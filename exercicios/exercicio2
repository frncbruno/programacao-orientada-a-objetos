package pkg;

import java.util.Scanner;

class Ex1 {

	public static void main(String[] args) {
		final double combustivel = 4.9;
		double odometroInicial;
		double odometroFinal;
		double numeroLitros;
		double valorTotal;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Marcação do odômetro inicial: ");
		odometroInicial = teclado.nextDouble();
		
		System.out.println("Marcação do odômetro final: ");
		odometroFinal = teclado.nextDouble();
		
		System.out.println("Número de litros de combustível gasto: ");
		numeroLitros = teclado.nextDouble();
		
		System.out.println("Valor total recebido dos passageiros: ");
		valorTotal = teclado.nextDouble();

		double totalKm = odometroFinal - odometroInicial;
		double mediaConsumo = totalKm / numeroLitros;
		double lucroDiario = valorTotal - (numeroLitros * combustivel);
				
		System.out.println("Total quilometragem: "+totalKm);
		System.out.println("Média do consumo: "+mediaConsumo);
		System.out.println("Lucro diário: "+lucroDiario);
	}

}
