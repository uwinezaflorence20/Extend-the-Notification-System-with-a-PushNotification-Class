public class Main {
    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification();
        SMSNotification smsNotification = new SMSNotification();

        // Pass a deviceId when creating PushNotification instance
        PushNotification pushNotification = new PushNotification("device123");
        NotificationService notificationService = pushNotification;

        // Sending notifications with different priorities
        emailNotification.sendNotification("This is an Email! Your account has been updated.", NotificationPriority.HIGH);
        smsNotification.sendNotification("This is an SMS! Meeting reminder in 30 minutes.", NotificationPriority.MEDIUM);
        notificationService.sendNotification("Sending Push Notification", NotificationPriority.LOW);

        // Bonus: PushNotification with deviceId
        PushNotification pushNotification1 = new PushNotification("device123");

        // Set default priority using overridden default method
        pushNotification1.setDefaultPriority("HIGH");

        // Create a NotificationService reference and use it
        NotificationService notificationService1 = pushNotification1;

        // Send a test message
        notificationService1.sendNotification("You've got a new update!", NotificationPriority.HIGH);
    }
}
