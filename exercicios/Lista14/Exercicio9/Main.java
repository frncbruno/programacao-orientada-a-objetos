// Crie uma classe Produto com atributos nome, preco e quantidade. Crie uma lista 
// de produtos e adicione alguns produtos nessa lista. Em seguida, percorra a lista e 
// imprima os dados de cada produto.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto[] produtos = new Produto[3];

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o nome do produto:");
            String nome = teclado.nextLine();

            System.out.println("Digite o preço do produto:");
            double preco = teclado.nextDouble();

            System.out.println("Digite a quantidade do produto:");
            int quantidade = teclado.nextInt();
            teclado.nextLine(); // Limpar o buffer

            produtos[i] = new Produto(nome, preco, quantidade);
        }

        System.out.println("\nProdutos cadastrados:");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println();
        }

        teclado.close();
}
