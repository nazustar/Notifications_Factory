package src;

public class EmailNotification extends Notification{

    @Override
    protected void send() {
        System.out.println("Se ha enviado la notificacion por Email.");
    }
    
}
