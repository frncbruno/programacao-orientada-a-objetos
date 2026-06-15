public class BancoDeDados implements AcessoDados {
    @Override
    public void conectar() {
        System.out.println("Conectado ao Banco de Dados.");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado do Banco de Dados.");
    }

    @Override
    public void inserir() {
        System.out.println("Dados inseridos!");
    }

    @Override
    public void atualizar() {
        System.out.println("Dados atualizados!");
    }

    @Override
    public void excluir() {
        System.out.println("Dados excluídos!");
    }
}
