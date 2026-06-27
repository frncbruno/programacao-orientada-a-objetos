import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Servidor {

    public static void main(String[] args) {
        try {
            // esse 1234 seria a porta do IP ficticia de acesso
            ServerSocket servidor = new ServerSocket(1234);
            System.out.println("Servidor iniciado. Aguardando conexoes...");

            while (true) {
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado!");

                ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(cliente.getInputStream());

                Veiculo veiculo;
                Resposta res;

                veiculo = (Veiculo) in.readObject();
                System.out.println("Veiculo recebido: " + veiculo);

                // cadastra o veiculo e envia a resposta
                try {
                    ArquivoVeiculo arquivo = new ArquivoVeiculo("veiculos");
                    List<Veiculo> listaVeiculos = arquivo.lerLista();
                    listaVeiculos.add(veiculo);
                    arquivo.gravarLista(listaVeiculos);
                    res = new Resposta("Cadastro realizado com sucesso!");
                } catch (Exception e) {
                    res = new Resposta("Erro ao cadastrar o veiculo.");
                }

                out.writeObject(res);

                cliente.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
