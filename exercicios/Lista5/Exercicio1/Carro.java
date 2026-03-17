import java.util.Scanner;

public class Carro {
	public String marca;
	public String modelo;
	
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
