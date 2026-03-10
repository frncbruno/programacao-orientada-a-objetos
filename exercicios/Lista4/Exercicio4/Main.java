public class Main
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        Livro l1 = new Livro();
        
        System.out.println("Digite o título do livro: ");
        p1.titulo = teclado.nextLine();
        
        System.out.println("Digite o autor do livro: ");
        p1.autor = teclado.nextLine();
        
        System.out.println("Digite o ano de publicação: ");
        p1.anoPublicacao = teclado.nextInt();
        
        System.out.println("Nome: "+p1.titulo);
        System.out.println("Idade: "+p1.autor);
        System.out.println("Gênero: "+p1.anoPublicacao);
        
        
    }
}
