public class PessoaJuridica extends Pessoa {
    
    // Atributo específico para Pessoa Jurídica
    private String cnpj;

    public PessoaJuridica(String nome, String cidade, String cnpj) {
        super(nome, cidade);
        this.cnpj = cnpj;
    }

    // Implementação obrigatória do método abstrato [cite: 8, 17]
    @Override
    public void efetuarCompra(double valor) {
        System.out.println("--- Compra - Pessoa Jurídica ---");
        System.out.println("Empresa: " + this.nome + " (CNPJ: " + this.cnpj + ")");
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Operação: Compra faturada via boleto corporativo (B2B).");
        System.out.println("Valor total com desconto de frota/atacado: R$ " + (valor * 0.90)); // Exemplo de regra interna: 10% de desconto
    }

    // Getter específico
    public String getCnpj() {
        return cnpj;
    }
}
