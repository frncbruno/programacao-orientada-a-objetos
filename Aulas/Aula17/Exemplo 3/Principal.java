package pkg;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Criando objetos Aluno
        Aluno aluno1 = new Aluno("João", 20);
        Aluno aluno2 = new Aluno("Maria", 22);
        Aluno aluno3 = new Aluno("Alziras", 19);
        
        // Criando a lista para receber os dados lidos
        List<Aluno> lista = new ArrayList<>();
        
        // Instanciando a classe Arquivo com o nome do arquivo "alunos"
        Arquivo arquivo = new Arquivo("alunos");
        
        // Gravando os três alunos no arquivo
        arquivo.gravaArquivo(aluno1);
        arquivo.gravaArquivo(aluno2);
        arquivo.gravaArquivo(aluno3);
        
        // Lendo os alunos do arquivo e armazenando o retorno na lista
        lista = arquivo.leArquivo();
        
        // Percorrendo a lista e exibindo os dados no console
        for (Aluno a : lista) {
            System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade());
        }
    }
}
