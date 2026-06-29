import java.io.Serializable;

// IMPLEMENTA SERIALIZABLE PARA PODER SALVAR O OBJETO

public class Aluno implements Serializable {

    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

    }

    @Override
    public String toString() {

        return "Nome: " + nome + " Idade: " + idade;

    }

}
