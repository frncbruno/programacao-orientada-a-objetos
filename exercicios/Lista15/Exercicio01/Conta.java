// A palavra-chave 'abstract' antes de 'class' define que a classe é abstrata[cite: 6].
public abstract class Conta {
    
    // Atributos solicitados
    protected double saldo;
    protected double limite;

    // Construtor para inicializar os atributos, conforme permitido em classes abstratas [cite: 360]
    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    // Métodos abstratos: não possuem corpo/implementação e terminam com ponto e vírgula.
    // Eles determinam o que as subclasses devem fazer, mas não como[cite: 8, 34].
    public abstract void depositar(double valor);
    
    public abstract void sacar(double valor);

    // Getters e Setters (Opcionais, para permitir o acesso controlado aos atributos)
    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }
}
