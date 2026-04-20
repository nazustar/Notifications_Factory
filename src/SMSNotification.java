package src;

public class SMSNotification extends Notification {
    
    @Override
    protected void send() {
        System.out.println("Se ha enviado la notificacion por SMS.");
    }
}
