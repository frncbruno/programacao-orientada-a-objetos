public class Gerente {
    private String nome;
    private double salario;
    private double bonusAnual;

    public Gerente(String nome, double salario, double bonusAnual) {
        this.nome = nome;
        this.salario = salario;
        this.bonusAnual = bonusAnual;
    }

    public void aumentarSalario(double porcentagem) {
        salario += salario * (porcentagem / 100) + bonusAnual;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", bonusAnual=" + bonusAnual +
                '}';
    }
    
}
