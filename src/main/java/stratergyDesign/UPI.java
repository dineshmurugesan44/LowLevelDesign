package stratergyDesign;

public class UPI implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Pay using UPI pay:" + amount);
    }
}
