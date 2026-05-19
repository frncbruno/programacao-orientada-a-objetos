// Crie uma classe Produto com um método desconto(). Em seguida, crie uma classe 
// ProdutoComDesconto que herda da classe Produto e sobrescreve o método desconto() para 
// calcular o desconto do produto com base em um valor predefinido e imprimir o preço com 
// desconto.

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void desconto() {
        System.out.println("Desconto padrão aplicado.");
    }
}
