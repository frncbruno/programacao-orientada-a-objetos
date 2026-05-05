package pkg;

public class Casa {
    public void calcularPreco(int tamanho) {
        double preco = tamanho * 1000; 
        System.out.println("O preço da casa é: R$ " + preco);

        // Sobrecarregue o método calcularPreco() para 
        // aceitar um número de quartos e retornar o preço da casa com base no tamanho e no 
        // número de quartos.
    
    public void calcularPreco(int tamanho, int quartos) {
        double preco = tamanho * 1000 + quartos * 5000; 
        System.out.println("O preço da casa é: R$ " + preco);
    }
}

