public class Principal {

    public static void main(String[] args) {

        Filme filme = new Filme("Vingadores", 3);

        try {

            filme.alugar(5);

        } catch (EstoqueInsuficienteException e) {

            // MOSTRA A MENSAGEM DA EXCECAO
            System.out.println(e.getMessage());

        }

    }

}
