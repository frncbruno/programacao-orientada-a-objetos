import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=== FUNCIONARIO CLT ===");
        System.out.print("Nome: ");
        String nomeCLT = teclado.nextLine();

        System.out.print("Salario Base: ");
        double salarioCLT = teclado.nextDouble();
        teclado.nextLine();

        FuncionarioCLT clt = new FuncionarioCLT(nomeCLT, salarioCLT);

        System.out.println();

        System.out.println("=== FUNCIONARIO PJ ===");
        System.out.print("Nome: ");
        String nomePJ = teclado.nextLine();

        System.out.print("Salario Base: ");
        double salarioPJ = teclado.nextDouble();

        FuncionarioPJ pj = new FuncionarioPJ(nomePJ, salarioPJ);

        System.out.println("\n--- DADOS DO FUNCIONARIO CLT ---");
        clt.exibirDados();
        System.out.println("Salario Final: R$ " + clt.calcularSalarioFinal());

        System.out.println();

        System.out.println("--- DADOS DO FUNCIONARIO PJ ---");
        pj.exibirDados();
        System.out.println("Salario Final: R$ " + pj.calcularSalarioFinal());

        teclado.close();
    }
}
