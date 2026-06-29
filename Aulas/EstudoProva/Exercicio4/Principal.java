import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Principal {

    public static void main(String[] args) {

        // CRIA UM PRODUTO

        ProdutoLoja produto = new ProdutoLoja(1, "Mouse", 120, 10);

        try {

            // REALIZA UMA VENDA

            produto.vender(3);

            System.out.println("Venda realizada.");

            // ===============================
            // GRAVANDO EM ARQUIVO TEXTO
            // ===============================

            FileWriter arquivo = new FileWriter("vendas.txt");

            BufferedWriter escritor = new BufferedWriter(arquivo);

            escritor.write(produto.toString());

            escritor.close();
            arquivo.close();

            System.out.println("Arquivo texto salvo.");

            // ===============================
            // SERIALIZANDO O OBJETO
            // ===============================

            FileOutputStream arquivoSaida = new FileOutputStream("produto.ser");

            ObjectOutputStream objetoSaida = new ObjectOutputStream(arquivoSaida);

            objetoSaida.writeObject(produto);

            objetoSaida.close();
            arquivoSaida.close();

            System.out.println("Objeto serializado.");

        }

        // CASO OCORRA ALGUM ERRO

        catch (Exception e) {

            System.out.println(e.getMessage());

        }

        // ===================================
        // LENDO O ARQUIVO TEXTO
        // ===================================

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

        // ===================================
        // DESSERIALIZANDO O OBJETO
        // ===================================

        try {

            FileInputStream arquivoEntrada = new FileInputStream("produto.ser");

            ObjectInputStream objetoEntrada = new ObjectInputStream(arquivoEntrada);

            ProdutoLoja produto2 = (ProdutoLoja) objetoEntrada.readObject();

            System.out.println("\nObjeto desserializado:");

            System.out.println(produto2);

            objetoEntrada.close();
            arquivoEntrada.close();

        }

        catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}
