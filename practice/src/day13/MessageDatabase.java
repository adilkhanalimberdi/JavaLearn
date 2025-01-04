package day13;

import java.util.ArrayList;

public class MessageDatabase {
    private static ArrayList <Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static ArrayList <Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        ArrayList <Message> dialog = new ArrayList<>();
        for (Message message : messages) {
            if ((message.getSender().equals(u1) && message.getReceiver().equals(u2)) || (message.getSender().equals(u2) && message.getReceiver().equals(u1)))
                dialog.add(message);
        }
        for (Message message : dialog) {
            System.out.println(message.getSender() + ": " + message.getText());
        }
    }
}
