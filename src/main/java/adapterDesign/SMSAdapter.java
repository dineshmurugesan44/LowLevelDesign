package adapterDesign;

public class SMSAdapter implements NotificationService{

    SMS_SDK sms = new SMS_SDK();

    @Override
    public void sendNotification(String to, String message) {
        sms.sendSMS(to, message);

    }
}
