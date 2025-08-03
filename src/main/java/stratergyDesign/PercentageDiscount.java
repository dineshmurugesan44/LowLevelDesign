package stratergyDesign;

public class PercentageDiscount implements DiscountStrategy {
    public int applyDiscount(int amount) {
        return amount - (amount * 30 / 100);
    }
}


