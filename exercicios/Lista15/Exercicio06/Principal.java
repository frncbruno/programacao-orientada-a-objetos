public class Principal {
    public static void main(String[] args) {
        // Criando um Gerente (Nome, Salário Base, Bônus) utilizando a referência de Funcionario [cite: 32]
        Funcionario gerente = new Gerente("Alice Souza", 5000.0, 2000.0);

        // Criando um Vendedor (Nome, Salário Base, Total Vendido, % de Comissão)
        Funcionario vendedor = new Vendedor("Bruno Costa", 2000.0, 30000.0, 0.10); // 10% de comissão

        // Apresentando as mensagens na tela com os salários calculados de forma polimórfica [cite: 32]
        System.out.println("--- Folha de Pagamento ---");
        System.out.println("Funcionário: " + gerente.getNome());
        System.out.println("Salário Final do Gerente: R$ " + gerente.calcularSalario());
        
        System.out.println(); // Saltar uma linha [cite: 99]

        System.out.println("Funcionário: " + vendedor.getNome());
        System.out.println("Salário Final do Vendedor: R$ " + vendedor.calcularSalario());
    }
}
