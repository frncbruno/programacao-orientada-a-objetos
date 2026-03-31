package pkg;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }

    public void calcularValorTotalEstoque() {
        double valorTotal = preco * quantidade;
        System.out.println("Valor total em estoque: " + valorTotal);
    }

    public boolean temEstoque() {
        if (this.quantidade > 0) {
            System.out.println("Tem estoque.");
            return true;
        } else {
            System.out.println("Sem estoque.");
            return false;
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade; // CORRIGIDO: usa this.quantidade
            System.out.println("Adicionado: " + quantidade + ". Novo total: " + this.quantidade);
        } else {
            System.out.println("Quantidade inválida.");
        }
    }

    public boolean vender(int quantidadeAVender) {
        if (quantidadeAVender > 0 && this.quantidade >= quantidadeAVender) {
            this.quantidade -= quantidadeAVender; 
            System.out.println("Vendido: " + quantidadeAVender + ". Restante: " + this.quantidade);
            return true;  
        }
        System.out.println("Erro na venda: Estoque insuficiente.");
        return false; 
    }
}
