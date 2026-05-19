// Crie uma classe Produto com um método calcularPrecoFinal(double preco) que retorna o 
// preço final do produto com base no preço passado como parâmetro. Sobrecarregue o método 
// calcularPrecoFinal() para aceitar um objeto Cliente e calcular o preço final do produto com base 
// no desconto do cliente.



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = teclado.nextDouble();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = teclado.next();

        System.out.print("Digite o desconto do cliente (em %): ");
        double desconto = teclado.nextDouble();

        Cliente cliente = new Cliente(nomeCliente, desconto);
        Produto produto = new Produto();

        double precoFinalSemDesconto = produto.calcularPrecoFinal(preco);
        double precoFinalComDesconto = produto.calcularPrecoFinal(preco, cliente);

        System.out.println("Preço final sem desconto: " + precoFinalSemDesconto);
        System.out.println("Preço final com desconto: " + precoFinalComDesconto);

        teclado.close();
    }
}
