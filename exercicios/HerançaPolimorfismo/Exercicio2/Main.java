import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		ArrayList<Produto> produtos = new ArrayList<>();

		int opcao;

		for (int i = 0; i < 5; i++) {

			System.out.println("1 - Produto Eletronico");
			System.out.println("2 - Produto Alimenticio");

			opcao = teclado.nextInt();
			teclado.nextLine();

			System.out.println("Nome:");
			String nome = teclado.nextLine();

			System.out.println("Preco:");
			double preco = teclado.nextDouble();

			System.out.println("Percentual de desconto:");
			double desconto = teclado.nextDouble();

			switch(opcao) {

				case 1:

					System.out.println("Garantia (anos):");
					int garantia = teclado.nextInt();

					produtos.add(
							new ProdutoEletronico(
									nome,
									preco,
									desconto,
									garantia));

					break;

				case 2:

					System.out.println("Validade (anos):");
					int validade = teclado.nextInt();

					produtos.add(
							new ProdutoAlimenticio(
									nome,
									preco,
									desconto,
									validade));

					break;

				default:

					System.out.println("Opcao invalida");
			}
		}

		System.out.println("\nLISTA DE PRODUTOS\n");

		for (int i = 0; i < produtos.size(); i++) {

			System.out.println("Nome: "
					+ produtos.get(i).getNome());

			System.out.println("Preco Original: "
					+ produtos.get(i).getPreco());

			System.out.println("Preco com Desconto: "
					+ produtos.get(i).aplicarDesconto());

			System.out.println("Preco Final: "
					+ produtos.get(i).calcularPrecoFinal());

			System.out.println("---------------------");
		}

		teclado.close();
	}

}

----------

public class Produto {
	
	protected String nome;
	protected double preco;
	protected double percentualDesconto;
	
	public Produto (String nome, double preco, double percentualDesconto) {
		this.nome = nome;
		this.preco = preco;
		this.percentualDesconto = percentualDesconto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public double aplicarDesconto() {
		return percentualDesconto;
	}
	
	public double calcularPrecoFinal() {
		return preco * percentualDesconto;
	}

}


--------------

public class ProdutoAlimenticio extends Produto{
	
	public int validade;
	
	public ProdutoAlimenticio (
			String nome,
			double preco,
			double percentualDesconto,
			int validade) {
		
		super(nome, preco, percentualDesconto);
		this.validade = validade;
	}
	
	@Override
	public double calcularPrecoFinal() {
		
		if (validade < 2) {
			
			// desconto para produtos próximos da validade
			return (preco * percentualDesconto)
					- (preco * 0.18);
		}
		else {
			return preco * percentualDesconto;
		}
	}

}

-----------------

public class ProdutoEletronico extends Produto {

	public int garantia;
	
	public ProdutoEletronico (
			String nome,
			double preco,
			double percentualDesconto,
			int garantia) {
		
		super(nome, preco, percentualDesconto);
		this.garantia = garantia;
	}
	
	@Override
	public double aplicarDesconto() {
		
		if (percentualDesconto == 0) {
			return preco;
		}
		else {
			return preco * percentualDesconto;
		}
	}
	
	@Override
	public double calcularPrecoFinal() {
		
		if (garantia == 0) {
			return preco * percentualDesconto;
		}
		
		if (garantia == 1) {
			// garantia de 1 ano
			return (preco * percentualDesconto)
					+ (preco * 0.25);
		}
		
		if (garantia == 2) {
			// garantia de 2 anos
			return (preco * percentualDesconto)
					+ (preco * 0.5);
		}
		
		return garantia;
	}
		
}
