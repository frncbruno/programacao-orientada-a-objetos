public class NotificacaoEmail extends Notificacao {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação por email...");
    }

    public void enviar(String destinatario) {
        System.out.println("Enviando notificação por email para: " + destinatario);
    }

    public void enviar(String... destinatarios) {
        System.out.println("Enviando notificação por email para os seguintes destinatários:");
        for (String destinatario : destinatarios) {
            System.out.println("- " + destinatario);
        }
    }
}
