// ESTA CLASSE CRIA UMA EXCECAO PERSONALIZADA

public class EstoqueInsuficienteException extends Exception {

    // CONSTRUTOR QUE RECEBE A MENSAGEM
    public EstoqueInsuficienteException(String mensagem) {
        super(mensagem);
    }

}
