package src;

// This class represents the web application that receives notifications.
public class AppWeb{

    NotificationFactory factory;

    public AppWeb (NotificationFactory factory){
        this.factory = factory;
    }

    public Notification receiveNotification(String type) {
        Notification notification;

        notification = factory.createNotification(type);

        notification.send();
        return notification;
    }
}