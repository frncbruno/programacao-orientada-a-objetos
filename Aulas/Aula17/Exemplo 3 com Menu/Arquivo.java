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
    public String nomeArquivo;

    // Construtor
    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    // Método para gravar dados (escreve um aluno por linha, sempre no final do arquivo)
    public void gravaArquivo(Aluno a) {
        try {
            // o parâmetro 'true' ativa o modo append, então o arquivo não é sobrescrito
            arqw = new FileWriter(nomeArquivo + ".txt", true);
            escritor = new BufferedWriter(arqw);

            escritor.write(a.getNome() + "," + a.getIdade());
            escritor.newLine();

            escritor.close();
            arqw.close();

            System.out.println("Aluno salvo no arquivo " + nomeArquivo + ".txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para ler dados
    // A lista é criada aqui dentro (e não como atributo da classe) para que cada
    // chamada retorne exatamente o que está no arquivo no momento, sem acumular
    // alunos repetidos a cada nova leitura.
    public List<Aluno> leArquivo() {
        List<Aluno> listAlunos = new ArrayList<>();

        try {
            arqr = new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqr);
            String linha;

            while ((linha = leitor.readLine()) != null) {
                if (linha.isBlank()) {
                    continue;
                }

                String[] campos = linha.split(",");

                String nome = campos[0];
                int idade = Integer.parseInt(campos[1]);

                Aluno aluno = new Aluno(nome, idade);
                listAlunos.add(aluno);
            }

            leitor.close();
            arqr.close();

        } catch (IOException e) {
            // Se o arquivo ainda não existe (nenhum aluno cadastrado ainda),
            // simplesmente retorna a lista vazia em vez de travar o programa.
            System.out.println("Arquivo " + nomeArquivo + ".txt ainda não existe ou não pode ser lido.");
        }

        return listAlunos;
    }
}
