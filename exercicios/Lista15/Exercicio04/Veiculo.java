// A palavra-chave abstract impede que a classe seja instanciada diretamente [cite: 4, 6]
public abstract class Veiculo {
    
    // Atributos protegidos para permitir acesso direto pelas subclasses herdadas
    protected String marca;
    protected String modelo;
    protected int ano;

    // Construtor para inicializar as propriedades [cite: 360]
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos abstratos: não possuem corpo, apenas a assinatura [cite: 8, 10]
    public abstract void acelerar();
    public abstract void frear();

    // Métodos concretos comuns (opcional, mas útil para exibir dados) [cite: 68, 359]
    public void exibirDados() {
        System.out.println("Veículo: " + marca + " " + modelo + " (" + ano + ")");
    }
}
