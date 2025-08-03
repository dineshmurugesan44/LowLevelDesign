package adapterDesign;
import sdkCHECK.EmailSDK;

public class EmailAdapter implements NotificationService{

    private EmailSDK emailSender = new EmailSDK();


    @Override
    public void sendNotification(String to, String message) {
        emailSender.sendEmail(to, message);

    }
}
