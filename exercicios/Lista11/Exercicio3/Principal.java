import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.print("Informe o nome: ");
        String nome = sc.nextLine();
        p.setNome(nome);

        System.out.print("Informe a idade: ");
        int idade = sc.nextInt();
        p.setIdade(idade);

        sc.nextLine(); =

        System.out.print("Informe o tipo: ");
        String tipo = sc.nextLine();
        p.setTipo(tipo);

        System.out.println("---");

        // atributos herdados de SerHumano, via animal também
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());

        // atributo herdado de Animal
        System.out.println("Tipo: " + p.getTipo());

        System.out.println("---");

        // método herdado de SerHumano
        System.out.println(p.falar());

        // método herdado de Animal
        p.andar();

        sc.close();
    }
}
