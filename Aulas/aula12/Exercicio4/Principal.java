import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Endereco endereco = new Endereco("Rua A", 123);
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        Pessoa pessoa1 = new Pessoa("João", 30);
        Pessoa pessoa2 = new Pessoa("Maria", 25);
        Pessoa pessoa3 = new Pessoa("Pedro", 40);

        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);

        //Chamando um método e passando a lista como parâmetro
        exibirPessoas(listaPessoas);
        exibirPessoas2(listaPessoas);
    }

    public static void exibirPessoas(List<Pessoa> lista) { //método que recebe uma lista de pessoas e exibe o nome e a idade de cada pessoa usando um loop for-each
        for (Pessoa p : lista) {
            System.out.println("Nome: "+p.getNome() + ", Idade: " + p.getIdade());
        }
    }

    private static void exibirPessoas2(List<Pessoa> lista){ //método que recebe uma lista de pessoas e exibe o nome e a idade de cada pessoa usando um loop for tradicional
        for(int i=0; i<lista.size(); i++){
            System.out.println("Nome: "+lista.get(i).getNome() + ", Idade: " + lista.get(i).getIdade());
        }
    }
}
