// A palavra-chave abstract garante que a classe não pode ser instanciada diretamente [cite: 4]
public abstract class Pessoa {
    
    // Atributos comuns herdados por ambas as subclasses [cite: 35]
    protected String nome;
    protected String cidade;

    // Construtor da classe abstrata
    public Pessoa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    // Método abstrato que DEVE ser implementado pelas subclasses [cite: 8, 11]
    public abstract void efetuarCompra(double valor);
}
