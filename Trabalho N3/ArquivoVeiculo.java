import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArquivoVeiculo {
    private String nomeArquivo;

    public ArquivoVeiculo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    // Grava a lista inteira de veiculos no arquivo, sobrescreve o arq
    public void gravarLista(List<Veiculo> listaVeiculos) {
        try {
            FileOutputStream arquivoSaida = new FileOutputStream(nomeArquivo + ".ser");
            ObjectOutputStream objetoSaida = new ObjectOutputStream(arquivoSaida);

            objetoSaida.writeObject(listaVeiculos);

            objetoSaida.close();
            arquivoSaida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Lê a lista de veiculos salva no arquivo
    public List<Veiculo> lerLista() {
        List<Veiculo> listaVeiculos = new ArrayList<>();
        try {
            FileInputStream arquivoEntrada = new FileInputStream(nomeArquivo + ".ser");
            ObjectInputStream objetoEntrada = new ObjectInputStream(arquivoEntrada);

            listaVeiculos = (List<Veiculo>) objetoEntrada.readObject();

            objetoEntrada.close();
            arquivoEntrada.close();
        } catch (IOException e) {
            // Se o arquivo ainda nao existe (primeira execucao), começa com lista vazia
            System.out.println("Nenhum arquivo de veiculos encontrado. Iniciando lista vazia.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listaVeiculos;
    }
}
