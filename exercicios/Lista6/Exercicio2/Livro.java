package pkg;

import java.util.Scanner;

public class Livro {
	public String titulo;
	public String autor;
	public int anoPublicacao;
	public String genero; 
	public boolean emprestado;
	
	public String retornaTitulo() {
		return titulo;
	}
	
	public String retornaAutor() {
		return autor;
	}
	
	public int retornaAnoPublicacao() {
		return anoPublicacao;
	}
	
	public String retornaGenero() {
		return genero;
	}
	
	public boolean retornaEmprestado() {
		return emprestado;
	}
	
	
	public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

	
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("O livro já está disponível.");
        }
    }

    public void verificarEstado(Scanner teclado) {

        if (emprestado) {
            System.out.println("O livro já está emprestado.");
            System.out.println("Deseja devolver? (s/n)");
            String resposta = teclado.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                devolver();
            } else {
                System.out.println("Livro continua emprestado.");
            }

        } else {
            System.out.println("O livro está disponível.");
            System.out.println("Deseja emprestar? (s/n)");
            String resposta = teclado.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                emprestar();
            } else {
                System.out.println("Livro continua disponível.");
            }
        }
    }
}
