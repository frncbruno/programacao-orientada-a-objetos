import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double n1, n2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite n1: ");
		n1 = teclado.nextFloat();
		System.out.println("Digite n2: ");
		n2 = teclado.nextFloat();
		
		double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;
        
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Todas operações");
        System.out.print("Escolha um número para fazer as operações: ");
        int escolha = teclado.nextInt();
        
        switch(escolha){ 
            case 1: 
                System.out.println("Soma: "+soma);
                break;
            case 2: 
                System.out.println("Subtração: "+subtracao);
                break;
            case 3:
                System.out.println("Multiplicação: "+multiplicacao);
                break;
            case 4: 
                System.out.println("Divisão: "+divisao);
                break;
            case 5:
                System.out.println("Soma: "+soma);
		        System.out.println("Subtração: "+subtracao);
		        System.out.println("Multiplicação: "+multiplicacao);
		        System.out.println("Divisão: "+divisao);
		        break;
		    default: 
		        System.out.println("O número escolhido é inválido! Escolha entre 1-5");
		        break;
        }
    } 

} 
