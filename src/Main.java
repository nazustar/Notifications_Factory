package src;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        AppWeb app = new AppWeb(factory);

        app.receiveNotification("email");
        app.receiveNotification("sms");
        app.receiveNotification("whatsapp");
    }
}
