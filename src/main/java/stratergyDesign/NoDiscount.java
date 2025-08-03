package stratergyDesign;

public class NoDiscount implements DiscountStrategy{
    public int applyDiscount(int amount) {
        return amount;
    }
}
