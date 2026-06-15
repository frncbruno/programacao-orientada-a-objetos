public abstract class Animal {
    private String nome;
    private int idade;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public abstract void emitirSom();
}

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato faz: Miau!");
    }
}
