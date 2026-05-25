package quickchat2;

public class Message {

    private String recipient;
    private String messageText;

    public Message(String recipient, String messageText) {

        this.recipient = recipient;
        this.messageText = messageText;

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

}