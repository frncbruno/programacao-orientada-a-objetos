import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Cadastro de Veiculo ===");

        System.out.print("Placa: ");
        String placa = teclado.nextLine();

        System.out.print("Modelo: ");
        String modelo = teclado.nextLine();

        System.out.print("Marca: ");
        String marca = teclado.nextLine();

        System.out.print("Ano de fabricacao: ");
        int ano = teclado.nextInt();

        System.out.print("Quilometragem: ");
        double km = teclado.nextDouble();
        teclado.nextLine();

        Veiculo veiculo = new Veiculo(placa, modelo, marca, ano, km);

        try {
            // Cria um socket e tenta "logar" no localhost, porta 1234
            Socket s = new Socket("localhost", 1234);
            System.out.println("Conexao estabelecida com sucesso");

            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(s.getInputStream());

            Resposta res;

            // envia o objeto veiculo para o servidor
            out.writeObject(veiculo);

            // aguarda a resposta do servidor
            res = (Resposta) in.readObject();

            System.out.println("Resposta do servidor: " + res.getMensagem());

            s.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        teclado.close();
    }
}
