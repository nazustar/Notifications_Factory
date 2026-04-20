package src;

public class Main {
    public static void main(String[] args) {
        NotificationsFactory factory = new NotificationsFactory();
        AppWeb app = new AppWeb(factory);

        app.recieveNotification("email");
        app.recieveNotification("sms");
        app.recieveNotification("whatsapp");
    }
}
