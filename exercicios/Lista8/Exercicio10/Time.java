package pkg;

public class Time {
	public String nome;
	public int golsMarcados;
	public int golsSofridos;
	
	public void valores(String no, int gM, int gS) {
		nome = no;
		golsMarcados = gM;
		golsSofridos = gS;
	}
	
	public void marcarGol(int gol) {
		golsMarcados += gol;
		System.out.println("Gols marcados: "+gol);
	}
	
	public void sofrerGol(int gol) {
		golsSofridos += gol;
		System.out.println("Gols sofridos: "+gol);
	}
	
	public int saldoGols() {
		return golsMarcados - golsSofridos;
	}
	
	public void resultadoPartida() {
		int saldo = saldoGols();
		
		if (saldo > 0) {
			System.out.println("Vitória");
		} else if (saldo == 0) {
			System.out.println("Empate");
		} else if (saldo < 0) {
			System.out.println("Derrota");
		}
	}
}
