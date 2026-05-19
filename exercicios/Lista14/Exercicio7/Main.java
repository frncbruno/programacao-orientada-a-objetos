// Crie uma classe Notificacao com um método enviar. Derive classes como 
// NotificacaoEmail e NotificacaoApp que extendem Notificacao.
// • Sobrecarregue o método enviar em NotificacaoEmail para aceitar um ou 
// mais destinatários.
// • Sobrescreva o método enviar em cada classe derivada para implementar a 
// lógica específica de envio.
// • Demonstre o envio de diferentes tipos de notificações usando objetos das 
// classes derivadas

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        NotificacaoEmail notificacaoEmail = new NotificacaoEmail();
        NotificacaoApp notificacaoApp = new NotificacaoApp();

        System.out.println("Digite a mensagem para o email:");
        String mensagemEmail = teclado.nextLine();
        notificacaoEmail.enviar(mensagemEmail, "destinatario1@email.com", "destinatario2@email.com");
        
        System.out.println("Digite a mensagem para o aplicativo:");
        String mensagemApp = teclado.nextLine();
        notificacaoApp.enviar(mensagemApp);

        teclado.close();
    }
}
