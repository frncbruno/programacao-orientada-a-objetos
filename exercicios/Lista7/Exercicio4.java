import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] nomes = {"Ana", "Carlos", "Maria", "Joao", "Pedro"};
        int i;

        try {
            System.out.print("Digite um numero de 0 a 4: ");
            indice = teclado.nextInt();

            System.out.println("Nome: " + nomes[i]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: indice fora do limite do array.");

        } catch (Exception e) {
            System.out.println("Erro: voce nao digitou um numero valido.");
        }

        teclado.close();
    }
}
