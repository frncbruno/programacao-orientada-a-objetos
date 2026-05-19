public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Produto A", 100.0);
        produto.desconto(); 

        ProdutoComDesconto produtoComDesconto = new ProdutoComDesconto(20.0);
        produtoComDesconto.desconto(); 
    }
}
