// Crie uma classe Pessoa com atributos nome, idade e sexo. Crie uma lista de 
// pessoas e adicione algumas pessoas nessa lista. Em seguida, crie um método que 
// recebe uma lista de pessoas e retorna a quantidade de mulheres. Por fim, chame 
// esse método passando a lista de pessoas e imprima a quantidade de mulheres.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de pessoas: ");
        int n = teclado.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = teclado.next();
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = teclado.nextInt();
            System.out.print("Digite o sexo da pessoa " + (i + 1) + " (M/F): ");
            char sexo = teclado.next().charAt(0);
            pessoas[i] = new Pessoa(nome, idade, sexo);
        }

        int quantidadeMulheres = contarMulheres(pessoas);
        System.out.println("Quantidade de mulheres: " + quantidadeMulheres);

        teclado.close();
}
