package builder;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;
    private String address;
    private double totalPrice;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTotalPrice(double price) {
        this.totalPrice = price;
    }

    public void showOrder() {
        System.out.println("=== Order Details ===");
        System.out.println("Items: " + items);
        System.out.println("Delivery Address: " + address);
        System.out.println("Total Price: $" + totalPrice);
    }
}
