public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        validarTriangulo();
    }

    public void validarTriangulo() {
        // Regra: a soma de dois lados não pode ser menor ou igual ao terceiro lado
        if ((lado1 + lado2 <= lado3) || (lado1 + lado3 <= lado2) || (lado2 + lado3 <= lado1)) {
            throw new IllegalArgumentException("Os lados informados não formam um triângulo válido!");
        }
    }
}
