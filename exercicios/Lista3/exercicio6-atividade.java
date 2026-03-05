package pkg;

import java.util.Scanner;

public class exercicio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] populacao = new double[5];
        String[] cidade = new String[5];

        double maior = 0;
        String cidadeMaior = "";

        for (int i = 0; i < populacao.length; i++) {

            System.out.print("Digite o nome da cidade " + (i + 1) + ": ");
            cidade[i] = teclado.nextLine();

            System.out.print("Digite a população da cidade: ");
            populacao[i] = teclado.nextDouble();
            teclado.nextLine(); 

            if (i == 0 || populacao[i] > maior) {
                maior = populacao[i];
                cidadeMaior = cidade[i];
            }
        }

        System.out.println("Cidade mais populosa: " + cidadeMaior);
        System.out.println("População: " + maior);

        teclado.close();
    }
}
