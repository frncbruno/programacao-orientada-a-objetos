package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Produto[] produtos = new Produto[5];

		int opcao;

		for (int i = 0; i < produtos.length; i++) {

			System.out.println("1 - Produto Eletronico");
			System.out.println("2 - Produto Alimenticio");

			opcao = sc.nextInt();
			sc.nextLine();

			System.out.println("Nome:");
			String nome = sc.nextLine();

			System.out.println("Preco:");
			double preco = sc.nextDouble();

			System.out.println("Percentual de desconto:");
			double desconto = sc.nextDouble();

			if (opcao == 1) {

				System.out.println("Garantia:");
				int garantia = sc.nextInt();

				produtos[i] = new ProdutoEletronico(
						nome,
						preco,
						desconto,
						garantia);
			}

			if (opcao == 2) {

				System.out.println("Validade:");
				int validade = sc.nextInt();

				produtos[i] = new ProdutoAlimenticio(
						nome,
						preco,
						desconto,
						validade);
			}
		}

		System.out.println("\nLISTA DE PRODUTOS\n");

		for (int i = 0; i < produtos.length; i++) {

			System.out.println("Nome: "
					+ produtos[i].getNome());

			System.out.println("Preco Original: "
					+ produtos[i].getPreco());

			System.out.println("Aplicar Desconto: "
					+ produtos[i].aplicarDesconto());

			System.out.println("Preco Final: "
					+ produtos[i].calcularPrecoFinal());

			System.out.println("---------------------");
		}

		sc.close();
	}

}

----------

package exercicio;

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

package exercicio;

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

  package exercicio;

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
