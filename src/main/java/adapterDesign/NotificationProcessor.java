package adapterDesign;

public class NotificationProcessor {
    private NotificationService service;

    public NotificationProcessor(NotificationService service) {
        this.service = service;
    }

    public void PushNotifications(String to, String message) {
        service.sendNotification(to, message);
    }

}
