public class Principal {
    public static void main(String[] args) {
        // Endereco endereco = new Endereco("Rua A", 123);
        Pessoa pessoa1 = new Pessoa("João", 30, new Endereco("Rua A", 123));


        System.out.println("Nome: "+pessoa1.getNome());
        System.out.println("Idade: "+pessoa1.getIdade());
        System.out.println("Endereço: "+pessoa1.getEndereco());
        System.out.println("Endereço: "+pessoa1.getEndereco().toString());
        System.out.println("Rua: "+pessoa1.getEndereco().getRua());
        System.out.println("Número: "+pessoa1.getEndereco().getNumero());
    }
}
