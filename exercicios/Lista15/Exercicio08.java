// Usamos a palavra-chave 'interface' em vez de 'class'
public interface AcessoDados {

    // Todos os métodos em uma interface são, por padrão, públicos e abstratos.
    // Eles não têm corpo (as chaves { }), terminando apenas com ponto e vírgula.
    
    void conectar();
    
    void desconectar();
    
    void inserir();
    
    void atualizar();
    
    void excluir();
}
