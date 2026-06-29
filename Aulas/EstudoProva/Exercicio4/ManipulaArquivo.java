import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

// CLASSE RESPONSAVEL POR TRABALHAR COM ARQUIVOS

public class ManipulaArquivo {

    // METODO PARA GRAVAR O PRODUTO EM UM ARQUIVO TEXTO

    public void gravarTexto(ProdutoLoja produto) {

        try {

            // CRIA O ARQUIVO

            FileWriter arquivo = new FileWriter("vendas.txt");

            // ESCREVE NO ARQUIVO

            BufferedWriter escritor = new BufferedWriter(arquivo);

            escritor.write(produto.toString());

            escritor.close();
            arquivo.close();

            System.out.println("Arquivo texto salvo.");

        }

        catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    // METODO PARA LER O ARQUIVO TEXTO

    public void lerTexto() {

        try {

            FileReader arquivo = new FileReader("vendas.txt");

            BufferedReader leitor = new BufferedReader(arquivo);

            String linha;

            System.out.println("\nDados do arquivo:");

            while ((linha = leitor.readLine()) != null) {

                System.out.println(linha);

            }

            leitor.close();
            arquivo.close();

        }

        catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    // METODO PARA SERIALIZAR O OBJETO

    public void serializar(ProdutoLoja produto) {

        try {

            FileOutputStream arquivo = new FileOutputStream("produto.ser");

            ObjectOutputStream objeto = new ObjectOutputStream(arquivo);

            objeto.writeObject(produto);

            objeto.close();
            arquivo.close();

            System.out.println("Objeto serializado.");

        }

        catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    // METODO PARA DESSERIALIZAR O OBJETO

    public void desserializar() {

        try {

            FileInputStream arquivo = new FileInputStream("produto.ser");

            ObjectInputStream objeto = new ObjectInputStream(arquivo);

            ProdutoLoja produto = (ProdutoLoja) objeto.readObject();

            System.out.println("\nObjeto desserializado:");

            System.out.println(produto);

            objeto.close();
            arquivo.close();

        }

        catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}
