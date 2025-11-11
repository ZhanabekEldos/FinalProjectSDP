package strategy;

public class VIPDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.8; // 20% off
    }
}
