public class Main {
    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification();
        SMSNotification smsNotification = new SMSNotification();


        PushNotification pushNotification = new PushNotification("device123");
        NotificationService notificationService = pushNotification;


        emailNotification.sendNotification("This is an Email! Your account has been updated.", NotificationPriority.HIGH);
        smsNotification.sendNotification("This is an SMS! Meeting reminder in 30 minutes.", NotificationPriority.MEDIUM);
        notificationService.sendNotification("Sending Push Notification", NotificationPriority.LOW);

        // Bonus: PushNotification with deviceId
        PushNotification pushNotification1 = new PushNotification("device123");


        pushNotification1.setDefaultPriority("HIGH");


        NotificationService notificationService1 = pushNotification1;


        notificationService1.sendNotification("You've got a new update!", NotificationPriority.HIGH);
    }
}
