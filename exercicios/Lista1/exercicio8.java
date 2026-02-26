import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int idade;

        System.out.println("Informe sua idade: ");
        idade = teclado.nextInt();
        
        if (idade < 16){ 
            System.out.println("Não apto para a votação");
        } else if (idade >= 16 && idade < 18 || idade > 70){ 
            System.out.println("Voto facultativo.");
        } else { 
            System.out.println("Voto obrigatório.");
        } 

        
    } 

} 
