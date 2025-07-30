package factoryMethod;

public class Email implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email Notification");
    }
}
