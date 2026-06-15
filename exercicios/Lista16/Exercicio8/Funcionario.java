public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public abstract void calcularSalario();
}

public class Gerente extends Funcionario {
    @Override
    public void calcularSalario() {
        double salarioComBonus = salario + (salario * 0.20); 
        System.out.println("Salário do Gerente com bônus: " + salarioComBonus);
    }
}

public class Vendedor extends Funcionario {
    @Override
    public void calcularSalario() {
        System.out.println("Salário do Vendedor: " + salario);
    }
}
