public class Gerente extends Funcionario {
    
    private double bonusGerencia;

    // O construtor usa o super() para repassar os dados ao construtor da classe pai [cite: 387]
    public Gerente(String nome, double salarioBase, double bonusGerencia) {
        super(nome, salarioBase);
        this.bonusGerencia = bonusGerencia;
    }

    // Implementação obrigatória do método abstrato [cite: 8, 11]
    @Override
    public double calcularSalario() {
        // Regra do Gerente: Salário Base + Bônus de Gerência
        return this.salarioBase + this.bonusGerencia;
    }
}
