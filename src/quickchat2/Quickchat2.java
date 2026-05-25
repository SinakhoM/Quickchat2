package quickchat2;

import java.util.Scanner;

public class Quickchat2 {

    static String[] sentMessages = new String[100];
    static int messageCount = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int option;
        int numMessages;

        System.out.println("Welcome to QuickChat");

        do {

            System.out.println("""
                    
                    1. Send Messages
                    2. Show recently sent messages
                    3. Quit
                    """);

            System.out.print("Choose an option: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {

                case 1 -> {

                    System.out.print("How many messages would you like to send? ");
                    numMessages = input.nextInt();
                    input.nextLine();

                    for (int i = 1; i <= numMessages; i++) {

                        System.out.println("\nMessage " + i);

                        System.out.print("Enter recipient number: ");
                        String recipient = input.nextLine();

                        System.out.print("Enter your message: ");
                        String text = input.nextLine();

                        Message msg = new Message(recipient, text);

                        sentMessages[messageCount] = text;
                        messageCount++;

                        System.out.println(msg.checkRecipientCell());

                        System.out.println(msg.checkMessageLength());

                        System.out.println("Message ID: "
                                + msg.getMessageID());

                        System.out.println("Valid ID: "
                                + msg.checkMessageID());

                        System.out.println("Message Hash: "
                                + msg.createMessageHash());

                        System.out.println("""
                                
                                Choose an option:
                                1. Send Message
                                2. Disregard Message
                                3. Store Message
                                """);

                        int sendOption = input.nextInt();
                        input.nextLine();

                        switch (sendOption) {

                            case 1 ->
                                System.out.println("Message successfully sent.");

                            case 2 ->
                                System.out.println("Press 0 to delete message.");

                            case 3 ->
                                System.out.println("Message successfully stored.");

                            default ->
                                System.out.println("Invalid option.");
                        }
                    }
                }

                case 2 -> {

                    if (messageCount == 0) {

                        System.out.println("No messages sent yet.");

                    } else {

                        System.out.println("\nRecently sent messages:");

                        for (int i = 0; i < messageCount; i++) {

                            System.out.println(sentMessages[i]);
                        }
                    }
                }

                case 3 -> {

                    System.out.println("Goodbye!");
                }

                default -> {

                    System.out.println("Invalid option.");
                }
            }

        } while (option != 3);
    }
}