public class ProdutoComDesconto {
    private double desconto;

    public ProdutoComDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void desconto() {
        System.out.println("Desconto aplicado: " + desconto + "%");
    }
}
