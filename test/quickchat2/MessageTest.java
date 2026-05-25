package quickchat2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MessageTest {

    @Test
    public void testCheckRecipientCell() {

        Message msg = new Message(
                "+27831234567",
                "Hello"
        );

        String result = msg.checkRecipientCell();

        assertEquals(
                "Cell phone number successfully captured.",
                result
        );
    }

    @Test
    public void testCheckRecipientCellFail() {

        Message msg = new Message(
                "0831234567",
                "Hello"
        );

        String result = msg.checkRecipientCell();

        assertEquals(
                "Cell phone number is incorrectly formatted.",
                result
        );
    }

    @Test
    public void testMessageLengthSuccess() {

        Message msg = new Message(
                "+27831234567",
                "Hello"
        );

        String result = msg.checkMessageLength();

        assertEquals(
                "Message ready to send.",
                result
        );
    }

    @Test
    public void testMessageIDLength() {

        Message msg = new Message(
                "+27831234567",
                "Testing"
        );

        assertTrue(
                msg.checkMessageID()
        );
    }

}
