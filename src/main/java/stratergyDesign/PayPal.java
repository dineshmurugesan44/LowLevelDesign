package stratergyDesign;

public class PayPal implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Pay using Pay PAL: " + amount);
    }
}
