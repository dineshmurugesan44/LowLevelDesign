package adapterDesign;

public class Client {
    public static void main(String[] args) {





        NotificationService service = new EmailAdapter();
        NotificationService service2 = new WhatspAdapter();

        NotificationProcessor processor2 = new NotificationProcessor(service);
        NotificationProcessor processor = new NotificationProcessor(service2);

        processor.PushNotifications("8428780439", "Attend the mock interview");
        processor2.PushNotifications("dineshmurugesan44@gmail.com", "Attend the mock interview");
    }
}
