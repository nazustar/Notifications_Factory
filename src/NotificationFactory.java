package src;

public class NotificationFactory{
    public Notification createNotification(String type){
        Notification notification = null;

        // Create new type of notification based on the type parameter.
        if (type.equals("email")){
            notification = new EmailNotification();
        } else if (type.equals("sms")){
            notification = new SMSNotification();
        } else if (type.equals("whatsapp")){
            notification = new WhatsAppNotification();
        }
        // It will return a Notification.
        return notification;
    }
}
