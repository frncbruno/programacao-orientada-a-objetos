// Crie uma classe Conta com atributos numero, titular e saldo. Crie uma 
// lista de contas e adicione algumas contas nessa lista. Em seguida, crie um 
// método que recebe uma lista de contas e retorna a conta com o maior saldo. 
// Por fim, chame esse método passando a lista de contas e imprima os dados 
// da conta com o maior saldo


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conta[] contas = new Conta[3];

        for (int i = 0; i < contas.length; i++) {
            System.out.println("Digite o número da conta:");
            int numero = teclado.nextInt();
            teclado.nextLine(); // Consumir a quebra de linha

            System.out.println("Digite o nome do titular:");
            String titular = teclado.nextLine();

            System.out.println("Digite o saldo da conta:");
            double saldo = teclado.nextDouble();

            contas[i] = new Conta(numero, titular, saldo);
        }

        Conta contaMaiorSaldo = encontrarContaMaiorSaldo(contas);
        System.out.println("Conta com o maior saldo:");
        System.out.println(contaMaiorSaldo);

        teclado.close();
}
