package bridge;

public class DigitalProduct implements ProductType {
    @Override
    public void showType() {
        System.out.println("This is a digital product (instant download).");
    }
}
