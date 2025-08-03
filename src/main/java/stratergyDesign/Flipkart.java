package stratergyDesign;

public class Flipkart {
    PaymentStrategy paymentMethod;
    DiscountStrategy discountType;

    public Flipkart(PaymentStrategy paymentMethod, DiscountStrategy discountType) {
        this.paymentMethod = paymentMethod;
        this.discountType = discountType;
    }

    public void makePayment(int amount) {

        int finalAmount = discountType.applyDiscount(amount);

        paymentMethod.pay(finalAmount);


    }
}
