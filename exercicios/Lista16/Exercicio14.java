public class Pessoa {
    private String nome;
    private String cidade;
    private int idade;

    public Pessoa(String nome, String cidade, int idade) {
        this.nome = nome;
        this.cidade = cidade;
        this.idade = idade;
        validarIdade(); // Valida assim que tenta criar a pessoa
    }

    public void validarIdade() {
        if (this.idade < 0 || this.idade > 120) {
            // Lança a exceção padrão do Java para argumentos inválidos
            throw new IllegalArgumentException("Idade inválida! Deve ser entre 0 e 120.");
        }
    }
}
