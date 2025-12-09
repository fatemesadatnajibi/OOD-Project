package notification;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String to, String message) {
        System.out.println("[Email] To: " + to + " | Message: " + message);
    }
}
