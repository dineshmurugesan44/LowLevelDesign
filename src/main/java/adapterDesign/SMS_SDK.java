package adapterDesign;

public class SMS_SDK {
    public void sendSMS(String phoneNumber, String message) {
        System.out.println("📱 SMS sent to " + phoneNumber + ": " + message);
    }
}
