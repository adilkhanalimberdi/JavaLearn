package day13;

import java.util.Date;

public class Message {
    private User sender, receiver;
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        Date date = new Date();
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = date;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Message{\n" +
                "FROM: " + this.getSender() + "\n" +
                "TO: " + this.getReceiver() + "\n" +
                "ON: " + this.getDate() + "\n" +
                this.getText();
    }
}
