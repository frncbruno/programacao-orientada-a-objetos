public class Disciplina {
	public String nome;
	public int cargaHoraria;
	public String nomeProfessor;
	
	public String retornaNome() {
		return nome;
	}
	
	public int retornaCargaHoraria() {
		return cargaHoraria;
	}
	
	public String retornaNomeProfessor() {
		return nomeProfessor;
	}
	
	public void exibirDados() { 
		System.out.println("Nome da disciplina: "+nome);
		System.out.println("Carga horária: "+cargaHoraria);
		System.out.println("Nome do professor: "+nomeProfessor);
	}
}
