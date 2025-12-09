/*package constants;

public enum Notifier {
    EMAIL,SMS
}*/
package notification;

public interface Notifier {
    void send(String to, String message);
}
