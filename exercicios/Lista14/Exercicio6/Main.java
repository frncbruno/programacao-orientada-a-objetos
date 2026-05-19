// Crie uma classe base Funcionario com atributos como nome e salario. Derive 
// classes específicas como Gerente e Desenvolvedor. Gerente possui um bônus anual, 
// enquanto Desenvolvedor tem horas extras.
// • Implemente métodos sobrecarregados aumentarSalario que aumentam o salário 
// baseado em diferentes critérios (porcentagem fixa para todos e uma porcentagem 
// adicional para Gerente que considera o bônus).
// • Sobrescreva o método toString para refletir informações específicas de cada tipo 
// de funcionário.
// • Crie um array de Funcionario que inclua Gerente e Desenvolvedor, e demonstre a 
// aplicação dos aumentos de salário e a impressão das informações.

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Gerente("Alice", 5000, 1000);
        funcionarios[1] = new Desenvolvedor("Bob", 3000, 10);
        funcionarios[2] = new Funcionario("Charlie", 2000);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
            funcionario.aumentarSalario(10); // Aumenta o salário em 10%
            System.out.println("Após aumento: " + funcionario);
            System.out.println();
        }
    }

    
}
