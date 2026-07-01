import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o titulo do livro:");
            String titulo = scanner.nextLine();

            System.out.println("Escolha a operacao:");
            System.out.println("1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            int opcao = scanner.nextInt();

            String operacao;
            if (opcao == 1) {
                operacao = "CONSULTAR";
            } else {
                operacao = "EMPRESTAR";
            }

            Socket s = new Socket("localhost", 1234);
            System.out.println("Conexao estabelecida com sucesso");

            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(s.getInputStream());

            Requisicao req = new Requisicao(operacao, titulo);
            out.writeObject(req);

            Resposta res = (Resposta) in.readObject();

            System.out.println(res.getMensagem());

            if (res.getLivro() != null) {
                Livro l = res.getLivro();
                System.out.println("Titulo: " + l.getTitulo());
                System.out.println("Autor: " + l.getAutor());
                System.out.println("Emprestado: " + l.isEmprestado());
            }

            s.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
