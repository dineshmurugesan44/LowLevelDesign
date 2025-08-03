package adapterDesign;

public class SlackAdapter implements NotificationService {

    SlackSDK slack = new SlackSDK();

    @Override
    public void sendNotification(String to, String message) {
        slack.push(to, message);

    }
}
