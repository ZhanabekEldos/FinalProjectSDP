package strategy;

public class SeasonalDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.9; // 10% off
    }
}
