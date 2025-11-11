package bridge;

public class DigitalProduct extends Product {

    public DigitalProduct(ProductType type) {
        super(type);
    }

    @Override
    public void showDetails() {
        System.out.print("Digital Product: ");
        productType.showType();
    }
}
