package builder;

public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        order = new Order();
    }

    public OrderBuilder addItem(String item) {
        order.addItem(item);
        return this;
    }

    public OrderBuilder setAddress(String address) {
        order.setAddress(address);
        return this;
    }

    public OrderBuilder setTotalPrice(double price) {
        order.setTotalPrice(price);
        return this;
    }

    public Order build() {
        return order;
    }
}
