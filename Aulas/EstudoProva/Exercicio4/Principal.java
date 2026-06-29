public class Principal {

    public static void main(String[] args) {

        ProdutoLoja produto = new ProdutoLoja(1, "Mouse", 120, 10);

        // CRIA O OBJETO RESPONSAVEL PELOS ARQUIVOS

        ManipulaArquivo arquivo = new ManipulaArquivo();

        try {

            // REALIZA A VENDA

            produto.vender(3);

            System.out.println("Venda realizada.");

            // CHAMA OS METODOS DA CLASSE ManipulaArquivo

            arquivo.gravarTexto(produto);

            arquivo.serializar(produto);

            arquivo.lerTexto();

            arquivo.desserializar();

        }

        catch (ProdutoException e) {

            System.out.println(e.getMessage());

        }

    }

}
