public class Agenda {

    public void adicionarContato(String nome, String telefone) {
        // Verifica se é nulo ou se o texto está em branco ("")
        if (nome == null || nome.isEmpty() || telefone == null || telefone.isEmpty()) {
            throw new IllegalArgumentException("Nome ou telefone não podem ficar vazios!");
        }
        
        System.out.println("Contato " + nome + " adicionado com sucesso!");
    }
}
