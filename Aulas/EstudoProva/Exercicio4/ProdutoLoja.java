import java.io.Serializable;

// IMPLEMENTA SERIALIZABLE PARA PODER SALVAR O OBJETO

public class ProdutoLoja extends Produto implements Serializable {

    // CONSTRUTOR

    public ProdutoLoja(int codigo, String nome, double preco, int estoque) {

        super(codigo, nome, preco, estoque);

    }

    // IMPLEMENTACAO DO METODO COMPRAR

    @Override
    public void comprar(int quantidade) throws ProdutoException {

        // VERIFICA SE O PRECO E VALIDO

        if (preco <= 0) {

            throw new ProdutoException("Preco invalido.");

        }

        // AUMENTA O ESTOQUE

        estoque += quantidade;

    }

    // IMPLEMENTACAO DO METODO VENDER

    @Override
    public void vender(int quantidade) throws ProdutoException {

        // VERIFICA SE TEM ESTOQUE

        if (quantidade > estoque) {

            throw new ProdutoException("Estoque insuficiente.");

        }

        // DIMINUI O ESTOQUE

        estoque -= quantidade;

    }

    // SOBRESCREVE O toString()

    @Override
    public String toString() {

        return "Codigo: " + codigo +
                "\nNome: " + nome +
                "\nPreco: " + preco +
                "\nEstoque: " + estoque;

    }

}
