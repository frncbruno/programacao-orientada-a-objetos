// 3 - Crie uma classe Pessoa com atributos nome, idade e sexo. Crie uma lista de pessoas e adicione
//  algumas pessoas nessa lista. Em seguida, crie um método que recebe uma lista de pessoas e 
// retorna a quantidade de mulheres. Por fim, chame esse método passando a lista de pessoas 
// e imprima a quantidade de mulheres.
package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[5];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = teclado.nextLine();
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int idade = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M/F):");
            String sexo = teclado.nextLine();
            pessoas[i] = new Pessoa(nome, idade, sexo);
        }

        int quantidadeMulheres = contarMulheres(pessoas);
        System.out.println("Quantidade de mulheres: " + quantidadeMulheres);

        teclado.close();

    }
}
