public class Vendedor extends Funcionario {
    
    private double totalVendas;
    private double percentualComissao; // Exemplo: 0.10 para 10%

    public Vendedor(String nome, double salarioBase, double totalVendas, double percentualComissao) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    // Implementação obrigatória do método abstrato [cite: 8, 11]
    @Override
    public double calcularSalario() {
        // Regra do Vendedor: Salário Base + (Total de Vendas * Percentual de Comissão)
        return this.salarioBase + (this.totalVendas * this.percentualComissao);
    }
}
