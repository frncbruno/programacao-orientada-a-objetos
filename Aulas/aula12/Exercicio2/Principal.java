public class Principal {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 2500.00);
        Produto p2 = p.clone(); // criando uma cópia de p

        System.out.println("Produto 1: " + p.getNome() + " - R$ " + p.getPreco());
        System.out.println("Produto 2: " + p2.getNome() + " - R$ " + p2.getPreco());
    }
}
