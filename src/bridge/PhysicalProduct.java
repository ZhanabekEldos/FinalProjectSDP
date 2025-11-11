package bridge;

public class PhysicalProduct extends Product {

    public PhysicalProduct(ProductType type) {
        super(type);
    }

    @Override
    public void showDetails() {
        System.out.print("Physical Product: ");
        productType.showType();
    }
}
