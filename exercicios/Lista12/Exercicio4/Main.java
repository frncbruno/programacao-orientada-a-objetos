// 4 -Crie uma classe Casa com um método calcularPreco(inttamanho) que retorna o preço da casa
//  com base no tamanho em metros quadrados. Sobrecarregue o método calcularPreco() para 
// aceitar um número de quartos e retornar o preço da casa com base no tamanho e no 
// número de quartos.

package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Casa casa = new Casa();

        System.out.print("Digite o tamanho da casa em metros quadrados: ");
        int tamanho = teclado.nextInt();

        System.out.print("Digite o número de quartos: ");
        int quartos = teclado.nextInt();

        double precoSemQuartos = casa.calcularPreco(tamanho);
        double precoComQuartos = casa.calcularPreco(tamanho, quartos);

        System.out.println("Preço da casa sem considerar os quartos: " + precoSemQuartos);
        System.out.println("Preço da casa considerando os quartos: " + precoComQuartos);

        teclado.close();

    }
}
