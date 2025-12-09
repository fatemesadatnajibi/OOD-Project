package payment;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("[Payment] Paid via Credit Card: " + amount);
    }
}
