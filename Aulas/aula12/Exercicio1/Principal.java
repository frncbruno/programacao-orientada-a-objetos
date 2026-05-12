public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João", 30);
        pri.exibeDadosPessoa(p);
    }

    public static void exibeDadosPessoa(Pessoa pe) {
        System.out.println("No método estático exibeDadosPessoa:");
        System.out.println("Nome: "+pe.getNome());
        System.out.println("Idade: "+pe.getIdade());
    }
}
