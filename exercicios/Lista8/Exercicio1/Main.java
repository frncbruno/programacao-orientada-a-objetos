package pkg;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("Caderno", 15.90, 5);
		
		System.out.println("Nome: " + p1.getNome());
        System.out.println("Preço: " + p1.getPreco());
        System.out.println("Quantidade: " + p1.getQuantidade());
        
        p1.calcularValorTotalEstoque();
        p1.temEstoque();
        p1.adicionarEstoque(5);
        p1.vender(2);
	}

}
