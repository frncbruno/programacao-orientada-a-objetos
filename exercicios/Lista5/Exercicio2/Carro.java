import java.util.Scanner;

public class Carro {
	public String marca;
	public String modelo;
	
	public Carro(String marcaCarro, String modeloCarro) { 
		System.out.println("-- Estou no construtor! --");
		marca = marcaCarro;
		modelo = modeloCarro;
	}
	
	public Carro(String marca) {
		System.out.println("-- Estou no outro construtor! --");
		this.marca = marca;	
	}
	
	public void atribuirValores(String ma, String mo) {
		marca = ma;
		modelo = mo;
	}
	
	public String retornaMarca() {
		return marca;
	}
	
	public String retornaModelo() {
		return modelo;
	}
}
