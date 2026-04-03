package pkg;

public class Main {

    public static void main(String[] args) {
		Pedido pedido1 = new Pedido(1, "Notebook", 2500.00, 2);
		System.out.println(pedido1.resumoPedido());
		System.out.println("Subtotal: R$" + pedido1.calcularSubtotal());
		System.out.println("Desconto (10%): R$" + pedido1.calcularDesconto(10));
		System.out.println("Total após desconto: R$" + pedido1.calcularTotal(10));
    }
}
