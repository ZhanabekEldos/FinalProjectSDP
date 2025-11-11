package adapter;

public class PayPalAdapter implements PaymentAdapter {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
