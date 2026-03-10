public class Main
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        Pessoa p1 = new Pessoa();
        
        System.out.println("Digite seu nome: ");
        p1.nome = teclado.nextLine();
        
        System.out.println("Digite sua idade: ");
        p1.idade = teclado.nextInt();
        
        System.out.println("Digite seu gênero: ");
        p1.genero = teclado.nextLine();
        
        System.out.println("Nome: "+p1.nome);
        System.out.println("Idade: "+p1.idade);
        System.out.println("Gênero: "+p1.genero);
        
        
    }
}
