package notification;

public class SmsNotifier implements Notifier {
    @Override
    public void send(String to, String message) {
        System.out.println("[SMS] To: " + to + " | Message: " + message);
    }
}
