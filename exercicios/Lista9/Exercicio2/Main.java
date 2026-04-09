import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Circulo c = new Circulo();

        System.out.println("Digite o raio: ");
        double raio = teclado.nextDouble();

        c.calculaArea(raio);
    }
}
