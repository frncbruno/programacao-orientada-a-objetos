// A palavra-chave 'abstract' antes de 'class' define que a classe é abstrata[cite: 6].
public abstract class Funcionario {
    
    // Atributos protegidos para permitir acesso direto pelas subclasses herdadas
    protected String nome;
    protected double salarioBase; // Usado aqui como base para o cálculo

    // Construtor para inicializar as propriedades comuns [cite: 360]
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método abstrato: não possui implementação e termina com ponto e vírgula[cite: 8].
    // Cada tipo de funcionário terá uma regra diferente para calcular o salário final.
    public abstract double calcularSalario();

    // Getter para o nome
    public String getNome() {
        return nome;
    }
}
