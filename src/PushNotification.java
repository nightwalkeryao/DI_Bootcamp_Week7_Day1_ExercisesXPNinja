public class PushNotification extends Notification{
    public String subscriberId;

    public PushNotification(String destination, String content) {
        super(destination, content, "Push");
        this.subscriberId = destination;
    }
}
