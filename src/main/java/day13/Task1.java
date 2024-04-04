package day13;
public class Task1 {
    public static void main(String[] args) {

        User user = new User("Тимур");
        User user2 = new User("Катя");
        User user3 = new User("Петр");

        System.out.println(user.isSubscribed(user2));
        user.subscribe(user2);
        System.out.println("Друзья? "+user.isFriend(user2));
        user2.subscribe(user);
        System.out.println("Друзья? "+user.isFriend(user2));
        System.out.println("Друзья? "+user2.isFriend(user));
        System.out.println(user.isSubscribed(user2));
        System.out.println(user2.isSubscribed(user));
        user.sendMessage(user2, "Привет");
        user.sendMessage(user2, "Как дела?");
        user2.sendMessage(user, "Привет!");
        user2.sendMessage(user, "Все отлично!");
        user2.sendMessage(user, "Как сам?");
        user3.sendMessage(user, "Привет!");
        user3.sendMessage(user, "Как дел?");
        user3.sendMessage(user, "Что нового?");
        user.sendMessage(user3, "Привет!!!");
        user.sendMessage(user3, "Все отлично!)");
        user.sendMessage(user3, "Как сам? Как жизнь молодая?");
        user3.sendMessage(user, "Все супер! Спасибо");
        MessageDatabase.showDialog(user, user3);


    }
}
