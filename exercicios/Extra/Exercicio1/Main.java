import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TESTE FUNCIONÁRIOS
        Funcionario f1 = new FuncionarioCLT("João", 2000);
        Funcionario f2 = new FuncionarioPJ("Maria", 3000);

        f1.exibirDados();
        System.out.println("Salário Final: " + f1.calcularSalarioFinal());

        f2.exibirDados();
        System.out.println("Salário Final: " + f2.calcularSalarioFinal());

        // TESTE DISPOSITIVOS
        Televisao tv = new Televisao();
        Lampada lamp = new Lampada();

        tv.ligar();
        tv.desligar();

        lamp.ligar();
        lamp.desligar();

        // MENU PRODUTO
        Scanner sc = new Scanner(System.in);
        Produto produto = null;

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU");
            System.out.println("1 - Criar produto (nome)");
            System.out.println("2 - Criar produto (nome e preço)");
            System.out.println("3 - Exibir informações");
            System.out.println("4 - Set nome");
            System.out.println("5 - Get nome");
            System.out.println("6 - Set preço");
            System.out.println("7 - Get preço");
            System.out.println("8 - Set estoque");
            System.out.println("9 - Get estoque");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                produto = new Produto(nome);
            } 
            else if (opcao == 2) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double preco = sc.nextDouble();
                produto = new Produto(nome, preco);
            } 
            else if (opcao == 3) {
                if (produto != null) produto.exibirInformacoes();
            } 
            else if (opcao == 4) {
                System.out.print("Novo nome: ");
                produto.setNome(sc.nextLine());
            } 
            else if (opcao == 5) {
                System.out.println(produto.getNome());
            } 
            else if (opcao == 6) {
                System.out.print("Novo preço: ");
                produto.setPreco(sc.nextDouble());
            } 
            else if (opcao == 7) {
                System.out.println(produto.getPreco());
            } 
            else if (opcao == 8) {
                System.out.print("Quantidade: ");
                produto.setQuantidadeEstoque(sc.nextInt());
            } 
            else if (opcao == 9) {
                System.out.println(produto.getQuantidadeEstoque());
            }
        }

        sc.close();
    }
}
