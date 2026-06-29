import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {

        Livro l1 = new Livro("Java", "Carlos");
        Livro l2 = new Livro("Banco", "Maria");
        Livro l3 = new Livro("POO", "Joao");

        // ESCREVENDO NO ARQUIVO
        try {

            FileWriter arquivo = new FileWriter("livros.txt");

            BufferedWriter escritor = new BufferedWriter(arquivo);

            // ESCREVE O PRIMEIRO LIVRO
            escritor.write(l1.getNome() + "," + l1.getAutor());
            escritor.newLine();

            // ESCREVE O SEGUNDO
            escritor.write(l2.getNome() + "," + l2.getAutor());
            escritor.newLine();

            // ESCREVE O TERCEIRO
            escritor.write(l3.getNome() + "," + l3.getAutor());

            escritor.close();
            arquivo.close();

            System.out.println("Arquivo salvo.");

        } catch (IOException e) {

            e.printStackTrace();

        }

        // LENDO O ARQUIVO
        try {

            FileReader arquivo = new FileReader("livros.txt");

            BufferedReader leitor = new BufferedReader(arquivo);

            String linha;

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(",");

                System.out.println("Nome: " + dados[0]);
                System.out.println("Autor: " + dados[1]);
                System.out.println();

            }

            leitor.close();
            arquivo.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
