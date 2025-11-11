package adapter;

public class CreditCardAdapter implements PaymentAdapter {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}
