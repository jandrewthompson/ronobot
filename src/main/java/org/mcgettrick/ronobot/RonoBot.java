import org.jibble.pircbot.*;

public class RonoBot extends PircBot {

    public MyBot() {
        this.setName("ronobot");
    }

    public void onMessage(String channel, String sender,
                        String login, String hostname, String message) {
        if (message.equalsIgnoreCase("time")) {
            String time = new java.util.Date().toString();
            sendMessage(channel, sender + ": The time is now " + time);
        }
    }
}
