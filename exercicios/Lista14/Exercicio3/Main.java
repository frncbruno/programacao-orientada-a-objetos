import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        double salarioFuncionario = teclado.nextDouble();
        f.calcularSalario(salarioFuncionario);

        Gerente g = new Gerente();

        System.out.println("Digite o bônus do gerente: ");
        double bonusGerente = teclado.nextDouble();


        g.calcularSalario(salarioFuncionario, bonusGerente); 

        teclado.close(); 
    }
}
