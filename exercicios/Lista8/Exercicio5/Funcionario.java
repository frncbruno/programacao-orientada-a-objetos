package pkg;

public class Funcionario {
    public String nome;
    public double salario;
    public double horasExtras;

    public Funcionario(String nome, double salario, double horasExtras) {
        this.nome = nome;
        this.salario = salario;
        this.horasExtras = horasExtras;
    }

    public double calcularValorHoraExtra() {
        return this.horasExtras * 50;
    }

    public double calcularPagamentoTotal() {
        return this.salario + calcularValorHoraExtra();
    }

    public void adicionarHorasExtras(int horas) {
    	this.horasExtras = horasExtras + horas;
    }

    public double salarioAnual() {
        return this.salario * 12;
    }
}
