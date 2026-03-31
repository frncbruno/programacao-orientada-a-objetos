package pkg;

public class Filme {
	public String titulo;
	public int duracao;
	public int classificacaoEtaria;
	
	public void valores(String ti, int du, int cE) {
		titulo = ti;
		duracao = du;
		classificacaoEtaria = cE;
	}
	
	public void converterDuracaoHoras(int duracao) {
		double horas = duracao / 60.0;
		System.out.println("Duracao do filme em horas: "+horas);
	}
	
	public boolean podeAssitir(int idade) {
		if (idade >= classificacaoEtaria) {
			System.out.println("Pode assitir");
			return true;
		} else {
			System.out.println("Nao pode assitir");
			return false;
		}
	}
	
	public void descricaoFilme() {
		System.out.println("Descrição do filme");
	}
}
