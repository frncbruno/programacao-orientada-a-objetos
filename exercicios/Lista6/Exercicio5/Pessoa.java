package pkg;

public class Pessoa {

    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Construtor com nome e idade chamado:");
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
  
    public Pessoa(int idade) {
        this.idade = idade;
        System.out.println("Construtor com apenas idade chamado:");
        System.out.println("Idade: " + idade);
    }
}
