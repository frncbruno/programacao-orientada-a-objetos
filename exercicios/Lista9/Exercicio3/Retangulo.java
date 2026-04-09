// // Crie uma classe Retangulo que possua os atributos base e altura. Proteja 
// os atributos utilizando encapsulamento. Crie os métodos get e set para cada 
// atributo. Crie um método calculaArea que calcule a área do retângulo e 
// retorne o resultado. Faça leitura pelo teclado dos valores.

package pkg;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaArea() {
        return base * altura;
    }
}
