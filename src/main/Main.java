package main;

import facade.ShopFacade;
import adapter.*;
import observer.*;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        ShopFacade shop = new ShopFacade();

        Customer customer = new Customer("Alice");
        shop.addCustomer(customer);

        shop.setPaymentAdapter(new PayPalAdapter());
        shop.setDiscountStrategy(new SeasonalDiscount());

        shop.makePurchase();
    }
}
