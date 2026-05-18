// 4 - Crie uma classe Livro com atributos titulo, autor e ano. Crie uma lista de livros e 
// adicione alguns livros nessa lista. Em seguida, ordene a lista de livros pelo 
// ano de lançamento e imprima os dados de cada livro.


package pkg;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("A Guerra dos Tronos", "George R.R. Martin", 1996);
        Livro[] livros = {livro1, livro2, livro3};

        Arrays.sort(livros, Comparator.comparingInt(Livro::getAno));

        System.out.println("Livros ordenados por ano de lançamento:");
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano: " + livro.getAno());
            System.out.println();
        }

        teclado.close();

    }
}
