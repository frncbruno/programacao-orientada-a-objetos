public class Produto {
    public double calcularPrecoFinal(double preco) {
        return preco;
    }

    public double calcularPrecoFinal(double preco, Cliente cliente) {
        double desconto = cliente.getDesconto();
        return preco - (preco * desconto / 100);
    }
    
}
