public class Pessoa {
 
    protected String nome;
 
    public Pessoa(String nome) {
        this.nome = nome;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void trabalhar() {
        System.out.println("A pessoa está trabalhando.");
    }
}
 
