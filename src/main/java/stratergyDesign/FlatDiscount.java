package stratergyDesign;

public class FlatDiscount implements DiscountStrategy{
    public int applyDiscount(int amount) {
        return amount - 1000;
    }
}
