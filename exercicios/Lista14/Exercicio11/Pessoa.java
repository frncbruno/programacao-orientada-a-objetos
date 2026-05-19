public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public static int contarMulheres(Pessoa[] pessoas) {
        int count = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f') {
                count++;
            }
        }
        return count;
    }
}
