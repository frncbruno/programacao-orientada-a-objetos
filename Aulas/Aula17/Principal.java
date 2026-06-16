package pkg;

import java.io.*;

class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João", 20);
		Aluno aluno2 = new Aluno("Maria", 22);
		Aluno aluno3 = new Aluno("Pedro", 19);
		
		// Escrevendo os alunos em .txt
		try { 
			FileWriter arquivo = new FileWriter("alunos.txt");
			BufferedWriter escritor = new BufferedWriter(arquivo);
			
			// Escrevendo os alunos no arquivo
			escritor.write(aluno1.getNome() + "," + aluno1.getIdade());
			escritor.newLine();
			
			escritor.write(aluno2.getNome() + "," + aluno2.getIdade());
			escritor.newLine();
			
			escritor.write(aluno3.getNome() + "," + aluno3.getIdade());
			escritor.newLine();
			
			escritor.close();
			arquivo.close();
			
			System.out.println("Alunos salvos no alunos.txt");
		} catch (IOException e) {
			e.printStackTrace(); 
		}

	}

}
