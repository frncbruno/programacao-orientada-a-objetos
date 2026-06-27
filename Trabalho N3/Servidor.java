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

                Veiculo veiculo;
                Resposta res;

                // Servidor recebe 1 objeto do tipo Veiculo do cliente
                veiculo = (Veiculo) in.readObject();
                System.out.println("Veiculo recebido: " + veiculo);

                // Servidor tenta cadastrar o veiculo e prepara a resposta
                try {
                    ArquivoVeiculo arquivo = new ArquivoVeiculo("veiculos");
                    List<Veiculo> listaVeiculos = arquivo.lerLista();
                    listaVeiculos.add(veiculo);
                    arquivo.gravarLista(listaVeiculos);
                    res = new Resposta("Cadastro realizado com sucesso!");
                } catch (Exception e) {
                    res = new Resposta("Erro ao cadastrar o veiculo.");
                }

                // Servidor envia o objeto Resposta para o cliente
                out.writeObject(res);

                cliente.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
