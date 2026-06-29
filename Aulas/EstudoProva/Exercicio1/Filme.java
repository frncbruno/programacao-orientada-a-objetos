public class Filme {

    // ATRIBUTOS DO FILME
    private String titulo;
    private int quantidadeDisponivel;

    // CONSTRUTOR
    public Filme(String titulo, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    // METODO PARA ALUGAR O FILME
    // O THROWS INFORMA QUE ESSE METODO PODE GERAR UMA EXCECAO
    public void alugar(int quantidade) throws EstoqueInsuficienteException {

        // VERIFICA SE HA FILMES SUFICIENTES
        if (quantidade > quantidadeDisponivel) {

            // LANCANDO A EXCECAO
            throw new EstoqueInsuficienteException("Quantidade indisponivel.");

        }

        // DIMINUI A QUANTIDADE
        quantidadeDisponivel -= quantidade;

        System.out.println("Aluguel realizado.");
        System.out.println("Estoque restante: " + quantidadeDisponivel);

    }

}
