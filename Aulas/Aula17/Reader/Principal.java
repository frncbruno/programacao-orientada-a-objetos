package pkg;

import java.io.*;

class Principal {

	public static void main(String[] args) {
		try { 
			FileReader arquivo = new FileReader("alunos.txt");
			BufferedReader leitor = new BufferedReader(arquivo);
			
			System.out.println("Alunos lidos no arquivo:");
			
			String linha;
			while ((linha = leitor.readLine()) != null) {
				String[] campos = linha.split(",");
				
				String nome = campos[0];
				int idade = Integer.parseInt(campos[1]);
				
				Aluno aluno = new Aluno(nome, idade);
				
				System.out.println("Nome: " + aluno.getNome() +  ", Idade: " + aluno.getIdade());
			}
			leitor.close();
			arquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
