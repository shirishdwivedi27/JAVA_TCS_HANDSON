/*
 * Notification Service
Create a NotificationService interface with send(String message).

Implement EmailNotification and SMSNotification.

Use constructor injection in a UserService class that notifies users.

Later, change it to setter injection and explain the difference.

 */

interface NotificationService {
    void send(String message);
}

class EmailNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email Notified" + message);
    }
}

class SMSNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS Notified" + message);
    }
}

class UserService {
    private NotificationService notificationService;

    UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void chkservice(String message) {
        notificationService.send(message);
    }
}

public class Note {
    public static void main(String[] args) {
        UserService u1 = new UserService(new SMSNotification());
        u1.chkservice("Hello Customer");

        UserService u2 = new UserService(new EmailNotification());
        u2.chkservice("Hello dear");
    }
}
