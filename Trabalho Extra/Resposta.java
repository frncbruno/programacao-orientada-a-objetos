import java.io.Serializable;

public class Resposta implements Serializable {

    private String mensagem;
    private Livro livro;

    public Resposta(String mensagem, Livro livro) {
        this.mensagem = mensagem;
        this.livro = livro;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
