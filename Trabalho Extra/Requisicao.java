import java.io.Serializable;

public class Requisicao implements Serializable {

    private String operacao;
    private String titulo;

    public Requisicao(String operacao, String titulo) {
        this.operacao = operacao;
        this.titulo = titulo;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
