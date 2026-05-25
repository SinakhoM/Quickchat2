package quickchat2;
import java.util.Random;

public class Message {

    private String recipient;
    private String messageText;
    private String messageID;
private static int totalMessages = 0;

    public Message(String recipient, String messageText) {

    this.recipient = recipient;
    this.messageText = messageText;

    this.messageID = generateMessageID();

    totalMessages++;

}
private String generateMessageID() {

    Random random = new Random();

    long number = 1000000000L
            + (long)(random.nextDouble() * 8999999999L);

    return String.valueOf(number);

}
public boolean checkMessageID() {

    return messageID.length() == 10;

}
    // Check recipient number
    public String checkRecipientCell() {

        if (recipient.startsWith("+27") && recipient.length() <= 12) {

            return "Cell phone number successfully captured.";

        } else {

            return "Cell phone number is incorrectly formatted.";

        }

    }

    // Check message length
    public String checkMessageLength() {

        if (messageText.length() <= 250) {

            return "Message ready to send.";

        } else {

            int excess = messageText.length() - 250;

            return "Message exceeds 250 characters by "
                    + excess;

        }

    }

 public String createMessageHash() {

    String[] words = messageText.split(" ");

    String firstWord = words[0];

    String lastWord = words[words.length - 1];

    return messageID.substring(0, 2)
            + ":"
            + totalMessages
            + ":"
            + firstWord.toUpperCase()
            + lastWord.toUpperCase();

}
public String getMessageID() {

    return messageID;

}
}