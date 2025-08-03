package stratergyDesign;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = PaymentStrategyFactory.getPaymentStrategy(PaymentType.UPI);
        DiscountStrategy discountStrategy = new FlatDiscount();
        Flipkart flipkart = new Flipkart(paymentStrategy, discountStrategy);
        flipkart.makePayment(10000);
    }
}
