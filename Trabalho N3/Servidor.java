import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Servidor {

    public static void main(String[] args) {
        try {
            // em porta seria a porta do IP, 1234, por exemplo
            ServerSocket servidor = new ServerSocket(1234);
            System.out.println("Servidor iniciado. Aguardando conexoes...");

            while (true) {
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado!");

                ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(cliente.getInputStream());

                Veiculo veiculo = (Veiculo) in.readObject();
                System.out.println("Veiculo recebido: " + veiculo);

                // cadastro do veiculo no arquvivo
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

                // envia a resposta pro cliente
                out.writeObject(resposta);

                cliente.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
