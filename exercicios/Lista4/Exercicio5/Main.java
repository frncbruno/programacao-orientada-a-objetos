public class Main
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        Produto p1 = new Produto();
        
        System.out.println("Digite o nome do produto: ");
        p1.nome = teclado.nextLine();
        
        System.out.println("Digite o preço do produto: ");
        p1.preco = teclado.nextDouble();
        
        System.out.println("Digite a quantidade do produto em estoque: ");
        p1.quantidadeEmEstoque = teclado.nextDouble();
        
        double valorTotal = preco * quantidadeEmEstoque;
        
        System.out.println("-- Produto --");
        System.out.println("Nome: "+p1.nome);
        System.out.println("Preço: "+p1.preco);
        System.out.println("Quantidade em estoque: "+p1.quantidadeEmEstoque);
        System.out.println("Valor total em estoque: "+p1.valorTotal);
        
    }
}
