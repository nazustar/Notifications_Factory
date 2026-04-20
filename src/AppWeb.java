package src;

public class AppWeb{

    NotificationsFactory factory;

    public AppWeb (NotificationsFactory factory){
        this.factory = factory;
    }

    public Notification recieveNotification(String type) {
        Notification notification;

        notification = factory.createNotification(type);

        notification.send();
        return notification;
    }
}