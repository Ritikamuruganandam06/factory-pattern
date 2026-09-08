public class PushNotification implements Notification{
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
