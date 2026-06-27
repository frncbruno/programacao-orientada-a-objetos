import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Servidor {

    public static void main(String[] args) {
        try {
            // Criacao do socket servidor e definicao da porta (1234)
            ServerSocket servidor = new ServerSocket(1234);
            System.out.println("Servidor iniciado. Aguardando conexoes...");

            while (true) {
                /* Servidor aguarda uma conexao de um cliente
                   O servidor bloqueia nesta linha enquanto um cliente nao chega
                   Quando um cliente se conecta, o servidor recebe uma referencia do
                   socket do cliente que se conectou (retorno do metodo) */
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado!");

                // Extraio o fluxo de saida e entrada de objetos do socket
                ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(cliente.getInputStream());

                // Servidor recebe 1 objeto do tipo Veiculo do cliente
                Veiculo veiculo = (Veiculo) in.readObject();
                System.out.println("Veiculo recebido: " + veiculo);

                // Servidor tenta cadastrar o veiculo no arquivo
                String resposta;
                try {
                    ArquivoVeiculo arquivo = new ArquivoVeiculo("veiculos");
                    List<Veiculo> listaVeiculos = arquivo.lerLista();
                    listaVeiculos.add(veiculo);
                    arquivo.gravarLista(listaVeiculos);
                    resposta = "Cadastro realizado com sucesso!";
                    System.out.println("Veiculo cadastrado com sucesso.");
                } catch (Exception e) {
                    resposta = "Erro ao cadastrar o veiculo.";
                    System.out.println("Erro ao cadastrar: " + e.getMessage());
                }

                // Servidor envia a resposta para o cliente
                out.writeObject(resposta);

                cliente.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
