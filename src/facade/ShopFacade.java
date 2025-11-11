package facade;

import builder.*;
import adapter.*;
import observer.*;
import strategy.*;

public class ShopFacade {
    private PaymentAdapter paymentAdapter;
    private DiscountStrategy discountStrategy;
    private OrderNotifier notifier = new OrderNotifier();

    public void addCustomer(OrderObserver customer) {
        notifier.addObserver(customer);
    }

    public void setPaymentAdapter(PaymentAdapter adapter) {
        this.paymentAdapter = adapter;
    }

    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }

    public void makePurchase() {
        Order order = new OrderBuilder()
                .addItem("Laptop")
                .addItem("Mouse")
                .setAddress("123 Main St")
                .setTotalPrice(1000)
                .build();

        double finalPrice = discountStrategy.applyDiscount(1000);
        order.setTotalPrice(finalPrice);
        order.showOrder();

        paymentAdapter.pay(finalPrice);
        notifier.notifyObservers("Your order has been confirmed!");
    }
}
