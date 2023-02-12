public class EmailNotification extends Notification {
    private String emailAddress;

    public EmailNotification(String destination, String content) {
        super(destination, content, "Email");
        this.emailAddress = destination;
    }
}
