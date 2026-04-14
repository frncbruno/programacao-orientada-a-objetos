import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Filme f = new Filme();

        System.out.println("Digite o título do filme:");
        f.setTitulo(teclado.nextLine());

        System.out.println("Digite o diretor do filme:");
        f.setDiretor(teclado.nextLine());

        System.out.println("Digite a duração do filme em minutos:");
        f.setDuracaoEmMinutos(teclado.nextInt());
        teclado.nextLine();

        System.out.println("Digite o gênero do filme:");
        f.setGenero(teclado.nextLine());

        f.exibirInformacoes();
        f.ehLongo();
        
        teclado.close(); 
    }
}
