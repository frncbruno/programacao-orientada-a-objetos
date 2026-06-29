public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalarioFinal() {
        return salarioBase + 500;
    }
}
