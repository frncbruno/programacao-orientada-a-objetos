public class Principal {
 
    public static void main(String[] args) {
 
        Pessoa p = new Pessoa("Carlos");
        System.out.println("Nome: " + p.getNome());
        p.trabalhar();
 
        System.out.println("---");
 
        Funcionario f = new Funcionario("Bruno");
        System.out.println("Nome: " + f.getNome());
        f.trabalhar();
    }
}
