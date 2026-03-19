package pkg;

public class Aluno {

    public String nome;
    public String matricula;
    public String dataNascimento;
    public int anoIngresso;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        System.out.println("Construtor 1 chamado:");
        System.out.println("Nome: " + nome + ", Matrícula: " + matricula);
    }
  
    public Aluno(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        System.out.println("Construtor 2 chamado:");
        System.out.println("Data de Nascimento: " + dataNascimento);
    }

    public Aluno(String nome, String dataNascimento, int anoIngresso) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoIngresso = anoIngresso;
        System.out.println("Construtor 3 chamado:");
        System.out.println("Nome: " + nome + ", Data de Nascimento: " + dataNascimento + ", Ano de Ingresso: " + anoIngresso);
    }
}
