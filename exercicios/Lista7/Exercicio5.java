import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String entrada;
        double celsius, fahrenheit;

        try {
            System.out.print("Digite a temperatura em Celsius (ex: 25.5): ");
            entrada = teclado.nextLine();

            celsius = Double.parseDouble(entrada);
            fahrenheit = (celsius * 9/5) + 32;

            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        } catch (NumberFormatException e) {
            System.out.println("Erro: formato invalido. Use ponto ao inves de virgula (ex: 25.5).");
        }

        teclado.close();
    }
}
