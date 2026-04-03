package pkg;

public class Pedido {

    public int numero;
    public String produto;
    public double preco;
    public int quantidade;


    public Pedido(int numero, String produto, double preco, int quantidade) {
        this.numero = numero;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return preco * quantidade;
    }

    public double calcularDesconto(double percentual) {
        return calcularSubtotal() * (percentual / 100);
    }

    public double calcularTotal(double percentualDesconto) {
        return calcularSubtotal() - calcularDesconto(percentualDesconto);
    }

    public String resumoPedido() {
        return "Pedido #" + numero + ": " + produto + " - Preço: R$" + preco + ", Quantidade: " + quantidade;
    }
}
