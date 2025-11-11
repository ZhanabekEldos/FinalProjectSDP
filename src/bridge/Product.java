package bridge;

public abstract class Product {
    protected ProductType productType;

    public Product(ProductType type) {
        this.productType = type;
    }

    public abstract void showDetails();
}
