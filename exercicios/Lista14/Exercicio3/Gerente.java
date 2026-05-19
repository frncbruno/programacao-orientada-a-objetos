public class Gerente extends Funcionario {
    @Override
    public void calcularSalario(double salario, double bonus) { 
        double salarioComBonus = salario + bonus;
        System.out.println("Salário do gerente com bônus: " + salarioComBonus);
    }
}
