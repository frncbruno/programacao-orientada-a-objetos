public class Desenvolvedor {
    private String nome;
    private double salario;
    private int horasExtras;

    public Desenvolvedor(String nome, double salario, int horasExtras) {
        this.nome = nome;
        this.salario = salario;
        this.horasExtras = horasExtras;
    }

    public void aumentarSalario(double porcentagem) {
        salario += salario * (porcentagem / 100) + (horasExtras * 20); // Supondo que cada hora extra vale 20
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", horasExtras=" + horasExtras +
                '}';
    }
}
