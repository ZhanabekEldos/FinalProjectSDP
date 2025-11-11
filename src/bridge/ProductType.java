package bridge;

public class PhysicalProduct implements ProductType {
    @Override
    public void showType() {
        System.out.println("This is a physical product (requires shipping).");
    }
}
