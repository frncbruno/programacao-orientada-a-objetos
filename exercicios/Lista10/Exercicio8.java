import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Usuario u = new Usuario();

        u.setNomeUsuario("admin");
        u.setSenha("12345");

        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = teclado.nextLine();

        System.out.print("Digite a senha: ");
        String senha = teclado.nextLine();

        u.login(nomeUsuario, senha);
        u.exibirStatus();
        u.logout();


        teclado.close(); 
    }
}
