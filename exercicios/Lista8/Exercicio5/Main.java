package pkg;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Bruno", 3000.0, 5);

        System.out.println("Funcionário: " + f1.nome);
        System.out.println("Salário Mensal Base: R$ " + f1.salario);
        
        f1.adicionarHorasExtras(2); 
        
        System.out.println("Total de Horas Extras: " + f1.horasExtras);
        System.out.println("Valor a receber de Extras: R$ " + f1.calcularValorHoraExtra());
        System.out.println("Pagamento Total (Mês): R$ " + f1.calcularPagamentoTotal());
        System.out.println("Salário Anual Base: R$ " + f1.salarioAnual());
    }
}
