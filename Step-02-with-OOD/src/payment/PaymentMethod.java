/*package constants;

public enum PaymentMethods {
    PAYPAL,CARD,CASH,ONSITE
}*/

package payment;

public interface PaymentMethod {
    void pay(double amount);
}