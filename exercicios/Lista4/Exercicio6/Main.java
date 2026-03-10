public class Main
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        Aluno a1 = new Aluno();
        
        System.out.println("Digite o nome: ");
        a1.nome = teclado.nextLine();
        
        System.out.println("Digite a matrícula: ");
        a1.matricula = teclado.nextLine();
        
        System.out.println("Digite a nota 1: ");
        a1.nota1 = teclado.nextLine();
        
        System.out.println("Digite a nota 2: ");
        a1.nota2 = teclado.nextLine();
        
        System.out.println("Digite a nota 3: ");
        a1.nota3 = teclado.nextLine();
        
        double media = (nota1 + nota2 + nota3)/3;
        
        System.out.println("-- Aluno --");
        System.out.println("Nome: "+a1.nome);
        System.out.println("Matrícula: "+a1.matricula);
        System.out.println("Média das notas: "+media);
        
        if(media >= 6){ 
            System.out.println("Sua média foi "+ media +". Você foi aprovado!");
        } else { 
            System.out.println("Sua média foi "+ media +". Você foi reprovado.");
        }
    }
}
