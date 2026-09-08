import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter notification type: ");
        String type = sc.nextLine();
        // Notification notification;
        // if(type.equalsIgnoreCase("EMAIL")) {
        //     notification = new EmailNotification();
        // }
        // else if(type.equalsIgnoreCase("SMS")) {
        //     notification = new SmsNotification();
        // }
        // else if(type.equalsIgnoreCase("PUSH")) {
        //     notification = new PushNotification();
        // }
        // else {
        //     System.out.println("invalid");
        //     return;
        // }
        Notification notification = NotificationFactory.createNotification(type);
        if(notification == null) {
            System.out.println("invalid notification type");
            return;
        } 
        notification.send("hello");
    }
}
