package adapterDesign;

public class WhatspAdapter implements NotificationService{

    WhatsappSDK whatsapp = new WhatsappSDK();

    @Override
    public void sendNotification(String to, String message) {
        whatsapp.sendWhatsAppMessage(to, message);

    }
}
