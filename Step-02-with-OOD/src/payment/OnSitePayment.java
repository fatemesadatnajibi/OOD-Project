package payment;

public class OnSitePayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("[Payment] On-site payment will be collected. Amount: " + amount);
    }
}