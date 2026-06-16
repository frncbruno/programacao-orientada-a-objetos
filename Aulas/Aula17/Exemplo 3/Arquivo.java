package pkg;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    // Atributos
    private FileWriter arqw;
    private BufferedWriter escritor;
    private FileReader arqr;
    private BufferedReader leitor;
    private List<Aluno> listAlunos;
    public String nomeArquivo;

    // Construtor
    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.listAlunos = new ArrayList<>();
    }

    // Método para gravar dados
    public void gravaArquivo(Aluno a) {
        try {
            // Escrevendo os alunos no arquivo (o parâmetro 'true' ativa o modo append)
            arqw = new FileWriter(nomeArquivo + ".txt", true);
            escritor = new BufferedWriter(arqw);
            
            escritor.write(a.getNome() + "," + a.getIdade());
            escritor.newLine();
            
            escritor.close();
            arqw.close();
            
            System.out.println("Alunos salvos no arquivo alunos.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para ler dados
    public List<Aluno> leArquivo() {
        System.out.println("Alunos lidos do arquivo:");
        try {
            arqr = new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqr);
            String linha;
            
            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(",");
                
                String nome = campos[0];
                int idade = Integer.parseInt(campos[1]);
                
                Aluno aluno = new Aluno(nome, idade);
                listAlunos.add(aluno);
            }
            
            leitor.close();
            arqr.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return listAlunos;
    }
}
