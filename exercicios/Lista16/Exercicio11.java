public class Livro implements Produto {
    private String nome;
    private double preco;
    private String descricao;

    public Livro(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public String getNome() { return this.nome; }

    @Override
    public double getPreco() { return this.preco; }

    @Override
    public String getDescricao() { return this.descricao; }
}

public class CD implements Produto {
    private String nome;
    private double preco;
    private String descricao;

    public CD(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public String getNome() { return this.nome; }

    @Override
    public double getPreco() { return this.preco; }

    @Override
    public String getDescricao() { return this.descricao; }
}
