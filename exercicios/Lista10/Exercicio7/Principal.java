import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto p = new Produto();

        System.out.print("Digite o nome do produto: ");
        p.setNome(teclado.nextLine());

        System.out.print("Digite o preço do produto: ");
        p.setPreco(teclado.nextDouble());

        System.out.print("Digite a quantidade do produto: ");
        p.setQuantidade(teclado.nextInt());

        p.exibirInformacoes();
        p.calcularValorTotal();

        teclado.close(); 
    }
}
