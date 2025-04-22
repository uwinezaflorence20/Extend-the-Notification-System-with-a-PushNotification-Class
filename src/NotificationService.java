// Enum for Notification Priority
enum NotificationPriority {
    HIGH, MEDIUM, LOW;
}

// Interface for Notification Service
public interface NotificationService {
    void sendNotification(String message, NotificationPriority priority);

    // Default method to set default priority (can be overridden)
    default void setDefaultPriority(String priority) {
        // Default implementation does nothing
    }
}

// Email Notification Implementation
class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message, NotificationPriority priority) {
        System.out.println("Sending Email Notification (Priority: " + priority + "): " + message);
    }
}

// SMS Notification Implementation
class SMSNotification implements NotificationService {
    @Override
    public void sendNotification(String message, NotificationPriority priority) {
        System.out.println("Sending SMS Notification (Priority: " + priority + "): " + message);
    }
}

// Push Notification Implementation with deviceId and overriding default method
class PushNotification implements NotificationService {
    private String deviceId;
    private String defaultPriority = "MEDIUM";

    // Constructor to initialize the deviceId
    public PushNotification(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void sendNotification(String message, NotificationPriority priority) {
        System.out.println("Sending Push Notification to device [" + deviceId +
                "] (Priority: " + priority + "): " + message);
    }

    @Override
    public void setDefaultPriority(String priority) {
        this.defaultPriority = priority.toUpperCase();
        System.out.println("Default priority set to: " + this.defaultPriority);
    }

    public String getDefaultPriority() {
        return defaultPriority;
    }

    public String getDeviceId() {
        return deviceId;
    }
}