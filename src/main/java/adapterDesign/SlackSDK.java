package adapterDesign;

public class SlackSDK {
    public void push(String slackId, String text) {
        System.out.println("💬 Slack message pushed to " + slackId + ": " + text);
    }
}
