// 2 - Crie uma classe Aluno com atributos nome, nota1 e nota2. Crie uma lista de alunos e 
// adicione alguns alunos nessa lista. Em seguida, percorra a lista e calcule a média de cada aluno. 
// Se a média for maior ou igual a 6, imprima que o aluno foi aprovado. 
// Caso contrário, imprima que o aluno foi reprovado.

package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = teclado.nextLine();
            System.out.print("Digite a nota 1 do aluno: ");
            double nota1 = teclado.nextDouble();
            System.out.print("Digite a nota 2 do aluno: ");
            double nota2 = teclado.nextDouble();
            teclado.nextLine();

            alunos[i] = new Aluno(nome, nota1, nota2);
        }

        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            if (media >= 6) {
                System.out.println(aluno.getNome() + " foi aprovado com média: " + media);
            } else {
                System.out.println(aluno.getNome() + " foi reprovado com média: " + media);
            }
        }

        teclado.close();

    }
}
