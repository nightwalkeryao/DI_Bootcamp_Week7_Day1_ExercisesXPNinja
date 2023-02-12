public class Notification {
    private String destination;
    private String content;
    private String preferredChannel;

    public Notification() {
        super();
    }

    public Notification(String destination, String content, String preferredChannel) {
        this.destination = destination;
        this.content = content;
        this.preferredChannel = preferredChannel;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPreferredChannel() {
        return preferredChannel;
    }

    public void setPreferredChannel(String preferredChannel) {
        this.preferredChannel = preferredChannel;
    }
}
