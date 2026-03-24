import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double num1, num2, resultado;
        int opcao;

        try {
            System.out.print("Digite o primeiro numero: ");
            num1 = teclado.nextDouble();

            System.out.print("Digite o segundo numero: ");
            num2 = teclado.nextDouble();

            System.out.println("\nEscolha a operacao:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.print("Opcao: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Erro: divisao por zero.");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    }
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } catch (Exception e) {
            System.out.println("Erro: voce digitou um valor invalido.");
        }

        teclado.close();
    }
}
