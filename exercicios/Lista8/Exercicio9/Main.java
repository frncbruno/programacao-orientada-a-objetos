package pkg;

public class Main {

    public static void main(String[] args) {
		Livro livro1 = new Livro("Harry Potter", "J.K. Rowling", 1178);
		
		System.out.println(livro1.detalhesLivro());
		System.out.println("Disponível para empréstimo: " + livro1.estaDisponivel());
		
		if (livro1.emprestar()) {
			System.out.println("Livro emprestado com sucesso!");
		} else {
			System.out.println("O livro já está emprestado.");
		}
		
		System.out.println("Disponível para empréstimo: " + livro1.estaDisponivel());
		
		if (livro1.devolver()) {
			System.out.println("Livro devolvido com sucesso!");
		} else {
			System.out.println("O livro não estava emprestado.");
		}
		
		System.out.println("Disponível para empréstimo: " + livro1.estaDisponivel());
    }
}
