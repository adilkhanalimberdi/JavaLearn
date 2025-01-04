package day13;

public class Task1 {

    public static void main(String[] args) {
        User user1 = new User("Френк");
        User user2 = new User("Оливер");
        User user3 = new User("Виллиям");

        MessageDatabase.sendMessage(user1, user2, "Привет, чувак!");
        MessageDatabase.sendMessage(user1, user2, "Как у тебя там дела?");

        MessageDatabase.sendMessage(user2, user1, "Здарова братух");
        MessageDatabase.sendMessage(user2, user1, "Все защибись, че сам как?");
        MessageDatabase.sendMessage(user2, user1, "Что то случилось, братан?");

        MessageDatabase.sendMessage(user3, user1, "Хей бро");
        MessageDatabase.sendMessage(user3, user1, "У меня тут дела, не поможешь?");
        MessageDatabase.sendMessage(user3, user1, "Помнишь тех ублюдков которые заняли у нас бабки? Надо их потрошить!");

        MessageDatabase.sendMessage(user1, user3, "Привет, ну че как там?");
        MessageDatabase.sendMessage(user1, user3, "Да помню я, мне сейчас нужно кое куда заехать");
        MessageDatabase.sendMessage(user1, user3, "Потом всретимся на районе, жди меня и будь на связи");

        MessageDatabase.sendMessage(user3, user1, "Ладно чувак, как скажешь.");

        MessageDatabase.showDialog(user3, user1);

        user2.subscribe(user1);
        System.out.println(user1.isSubscribed(user2) + " " + user1.isFriend(user2));
        System.out.println(user2.isSubscribed(user1) + " " + user2.isFriend(user1));
    }

}
