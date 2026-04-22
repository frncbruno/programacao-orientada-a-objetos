import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = null;
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Criar produto informando nome");
            System.out.println("2 - Criar produto informando nome e preco");
            System.out.println("3 - Exibir informacoes do produto");
            System.out.println("4 - Atribuir nome do produto");
            System.out.println("5 - Obter nome do produto");
            System.out.println("6 - Atribuir preco do produto");
            System.out.println("7 - Obter preco do produto");
            System.out.println("8 - Atribuir quantidade em estoque");
            System.out.println("9 - Obter quantidade em estoque");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome1 = sc.nextLine();
                    produto = new Produto(nome1);
                    System.out.println("Produto criado!");
                    break;

                case 2:
                    System.out.print("Digite o nome: ");
                    String nome2 = sc.nextLine();
                    System.out.print("Digite o preco: ");
                    double preco2 = sc.nextDouble();
                    sc.nextLine();
                    produto = new Produto(nome2, preco2);
                    System.out.println("Produto criado!");
                    break;

                case 3:
                    if (produto == null) {
                        System.out.println("Nenhum produto criado ainda.");
                    } else {
                        produto.exibirInformacoes();
                    }
                    break;

                case 4:
                    if (produto == null) {
                        System.out.println("Nenhum produto criado ainda.");
                    } else {
                        System.out.print("Novo nome: ");
                        String novoNome = sc.nextLine();
                        produto.setNome(novoNome);
                    }
                    break;

                case 5:
                    if (produto == null) {
                        System.out.println("Nenhum produto criado ainda.");
                    } else {
                        System.out.println("Nome: " + produto.getNome());
                    }
                    break;

                case 6:
                    if (produto == null) {
                        System.out.println("Nenhum produto criado ainda.");
                    } else {
                        System.out.print("Novo preco: ");
                        double novoPreco = sc.nextDouble();
                        sc.nextLine();
                        produto.setPreco(novoPreco);
                    }
                    break;

                case 7:
                    if (produto == null) {
                        System.out.println("Nenhum produto criado ainda.");
                    } else {
                        System.out.println("Preco: " + produto.getPreco());
                    }
                    break;

                case 8:
                    if (produto == null) {
                        System.out.println("Nenhum produto criado ainda.");
                    } else {
                        System.out.print("Nova quantidade: ");
                        int novaQtd = sc.nextInt();
                        sc.nextLine();
                        produto.setQuantidadeEstoque(novaQtd);
                    }
                    break;

                case 9:
                    if (produto == null) {
                        System.out.println("Nenhum produto criado ainda.");
                    } else {
                        System.out.println("Estoque: " + produto.getQuantidadeEstoque());
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
