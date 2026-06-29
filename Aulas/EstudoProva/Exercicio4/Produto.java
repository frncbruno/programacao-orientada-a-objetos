// CLASSE ABSTRATA

public abstract class Produto {

    // ATRIBUTOS DO PRODUTO
    protected int codigo;
    protected String nome;
    protected double preco;
    protected int estoque;

    // CONSTRUTOR
    public Produto(int codigo, String nome, double preco, int estoque) {

        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;

    }

    // METODOS ABSTRATOS
    // AS CLASSES FILHAS SAO OBRIGADAS A IMPLEMENTAR

    public abstract void comprar(int quantidade) throws ProdutoException;

    public abstract void vender(int quantidade) throws ProdutoException;

}
