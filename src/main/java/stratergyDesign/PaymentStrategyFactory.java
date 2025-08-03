package stratergyDesign;

public class PaymentStrategyFactory {
    public static PaymentStrategy getPaymentStrategy(PaymentType paymentType) {
       return switch (paymentType) {
            case CREDIT_CARD
                     -> new CreditCard();

            case UPI
                    -> new UPI();

            case PAYPAL
                    -> new PayPal();

            default -> throw new IllegalArgumentException("Unsupported payment type: " + paymentType);


        };


    }

}
