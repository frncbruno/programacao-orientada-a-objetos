import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String entrada;
        double numero;

        try {
            System.out.print("Digite um numero (pode ser com decimal): ");
            entrada = teclado.nextLine();

            numero = Double.parseDouble(entrada);

            System.out.println("Numero convertido: " + numero);

        } catch (Exception e) {
            System.out.println("Erro: nao foi possivel converter para numero.");
        }

        teclado.close();
    }
}
