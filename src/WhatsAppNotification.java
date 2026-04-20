package src;
public class WhatsAppNotification extends Notification{
    @Override
    protected void send() {
        System.out.println("Se ha enviado la notificacion por WhatsApp.");
    }
}
