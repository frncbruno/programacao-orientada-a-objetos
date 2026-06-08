public class Principal {
    public static void main(String[] args) {
        // Polimorfismo: Tipo da Interface guardando um objeto da classe concreta
        AcessoDados meuBanco = new BancoDeDados();

        System.out.println("--- Tentando mexer no banco desligado ---");
        meuBanco.inserir(); // Vai dar erro porque não conectou ainda

        System.out.println("\n--- Fluxo correto de operações ---");
        meuBanco.conectar();      // Liga o banco
        meuBanco.inserir();       // Insere o dado
        meuBanco.atualizar();     // Atualiza o dado
        meuBanco.excluir();       // Apaga o dado
        meuBanco.desconectar();   // Desliga o banco
    }
}
