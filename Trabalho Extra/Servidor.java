import java.net.*;
import java.io.*;
import java.util.ArrayList;

public class Servidor {

    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(1234);
            System.out.println("Servidor da biblioteca criado com sucesso");

            // dados de teste
            ArrayList<Livro> livros = new ArrayList<Livro>();
            livros.add(new Livro("Dom Casmurro", "Machado de Assis"));
            livros.add(new Livro("O Cortico", "Aluisio Azevedo"));
            livros.add(new Livro("Iracema", "Jose de Alencar"));

            while (true) {

                Socket cliente = servidor.accept();

                ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(cliente.getInputStream());

                Requisicao req = (Requisicao) in.readObject();
                System.out.println("Recebi operacao " + req.getOperacao() + " para o livro " + req.getTitulo());

                Livro encontrado = null;
                for (int i = 0; i < livros.size(); i++) {
                    Livro l = livros.get(i);
                    if (l.getTitulo().equalsIgnoreCase(req.getTitulo())) {
                        encontrado = l;
                    }
                }

                Resposta res;

                if (req.getOperacao().equals("CONSULTAR")) {

                    if (encontrado != null) {
                        res = new Resposta("Livro encontrado", encontrado);
                    } else {
                        res = new Resposta("Livro nao encontrado", null);
                    }

                } else if (req.getOperacao().equals("EMPRESTAR")) {

                    if (encontrado == null) {
                        res = new Resposta("Erro: livro inexistente", null);
                    } else if (encontrado.isEmprestado()) {
                        res = new Resposta("Erro: livro ja emprestado", null);
                    } else {
                        encontrado.setEmprestado(true);
                        res = new Resposta("Emprestimo realizado com sucesso", encontrado);
                    }

                } else {
                    res = new Resposta("Operacao invalida", null);
                }

                out.writeObject(res);

                cliente.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
