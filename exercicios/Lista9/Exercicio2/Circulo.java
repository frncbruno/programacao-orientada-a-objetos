public class Circulo {
    private double raio;

    public Circulo() {}

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void calculaArea(double raio){
        double area = 3.14*Math.pow(raio, 2);
        System.out.println("Área do círculo é de: "+area);
    }
}
