// Crie uma classe chamada Livro com os atributos titulo, autor, paginas e emprestado (boolean). Crie um construtor que inicialize os atributos. Implemente os métodos emprestar(), que marca o livro como emprestado caso esteja disponível e retorna true, devolver(), que marca o livro como disponível novamente, estaDisponivel(), que retorna true caso o livro não esteja emprestado, e detalhesLivro(), que retorna uma string contendo as informações do livro.

package pkg;

public class Livro {

    public String titulo;
    public String autor;
    public int paginas;
    public boolean emprestado;


    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.emprestado = false;
    }

    public boolean emprestar() {
        if (!emprestado) {
            emprestado = true;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (emprestado) {
            emprestado = false;
            return true;
        }
        return false;
    }

    public boolean estaDisponivel() {
        return !emprestado;
    }

    public String detalhesLivro() {
        return "Livro: " + titulo + " - Autor: " + autor + " - Páginas: " + paginas;
    }
}
