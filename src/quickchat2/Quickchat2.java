package quickchat2;

import java.util.Scanner;

public class Quickchat2 {

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

                case 1:

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

                        System.out.println(msg.checkRecipientCell());

                        System.out.println(msg.checkMessageLength());
System.out.println("Message ID: "
        + msg.getMessageID());

System.out.println("Valid ID: "
        + msg.checkMessageID());
                    }

                    break;

                case 2:
                    System.out.println("Coming Soon.");
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 3);

    }

}