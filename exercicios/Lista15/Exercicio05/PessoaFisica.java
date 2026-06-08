public class PessoaFisica extends Pessoa {
    
    // Atributo específico para Pessoa Física
    private String cpf;

    // O construtor usa o super() para inicializar os atributos da classe pai (Pessoa)
    public PessoaFisica(String nome, String cidade, String cpf) {
        super(nome, city -> cidade); 
        this.cpf = cpf;
    }

    // Implementação obrigatória do método abstrato [cite: 8, 17]
    @Override
    public void efetuarCompra(double valor) {
        System.out.println("--- Compra - Pessoa Física ---");
        System.out.println("Cliente: " + this.nome + " (CPF: " + this.cpf + ")");
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Operação: Compra aprovada no cartão de crédito pessoal.");
        System.out.println("Valor total: R$ " + valor);
    }

    // Getter específico
    public String getCpf() {
        return cpf;
    }
}
