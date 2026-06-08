// A classe BancoDeDados assina o contrato da interface AcessoDados
public class BancoDeDados implements AcessoDados {

    // Criamos um atributo simples para simular se o banco está ligado ou desligado
    private boolean conectado = false;

    // Implementação obrigatória do método conectar()
    @Override
    public void conectar() {
        if (!conectado) {
            conectado = true;
            System.out.println("[Banco de Dados] Conexão estabelecida com sucesso.");
        } else {
            System.out.println("[Banco de Dados] O banco já está conectado.");
        }
    }

    // Implementação obrigatória do método desconectar()
    @Override
    public void desconectar() {
        if (conectado) {
            conectado = false;
            System.out.println("[Banco de Dados] Conexão encerrada com segurança.");
        } else {
            System.out.println("[Banco de Dados] Erro: O banco já estava desconectado.");
        }
    }

    // Implementação obrigatória do método inserir()
    @Override
    public void inserir() {
        if (conectado) {
            System.out.println("[Banco de Dados] Executando comando: INSERT INTO tabela... (Dados inseridos).");
        } else {
            System.out.println("[Banco de Dados] Erro: Não é possível inserir dados sem estar conectado.");
        }
    }

    // Implementação obrigatória do método atualizar()
    @Override
    public void atualizar() {
        if (conectado) {
            System.out.println("[Banco de Dados] Executando comando: UPDATE tabela... (Dados atualizados).");
        } else {
            System.out.println("[Banco de Dados] Erro: Não é possível atualizar dados sem estar conectado.");
        }
    }

    // Implementação obrigatória do método excluir()
    @Override
    public void excluir() {
        if (conectado) {
            System.out.println("[Banco de Dados] Executando comando: DELETE FROM tabela... (Dados excluídos).");
        } else {
            System.out.println("[Banco de Dados] Erro: Não é possível excluir dados sem estar conectado.");
        }
    }
}
