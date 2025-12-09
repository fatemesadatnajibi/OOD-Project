package payment;

public class PaypalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("[Payment] Paid via PayPal: " + amount);
    }
}

