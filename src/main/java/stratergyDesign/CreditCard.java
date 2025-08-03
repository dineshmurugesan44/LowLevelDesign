package stratergyDesign;

public class CreditCard implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Pay using CreditCard: " + amount);
    }
}
