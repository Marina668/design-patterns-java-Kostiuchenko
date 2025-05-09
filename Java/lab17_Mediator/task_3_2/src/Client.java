import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] args) {
        String[] usersTypes = {
                "Admin",
                "Moderator",
                "User"
        };

        Mediator mediatorUser = new ConcreteUserMediator();
        Mediator mediatorAdmin = new AdminMediator();
        Mediator mediatorModerator = new ModeratorMediator();
        Mediator mediatorAll = new AllUsersMediator();
        mediatorUser.setNext(mediatorAdmin);
        mediatorAdmin.setNext(mediatorModerator);
        mediatorModerator.setNext(mediatorAll);

        UserCollection userCollection = new UserCollection();
        Random random = new Random();
        int users_number = random.nextInt(10, 20);
        int userId = 100;
        for (int i = 0; i < users_number; i++) {
            String type = usersTypes[random.nextInt(usersTypes.length)];
            ConcreteUser user = new ConcreteUser(type + "_" + userId, type);
            user.setMediator(mediatorUser);
            userCollection.addUser(user);
            userId++;
        }
        mediatorUser.setUserCollection(userCollection);
        mediatorAdmin.setUserCollection(userCollection);
        mediatorModerator.setUserCollection(userCollection);
        mediatorAll.setUserCollection(userCollection);

        List<ConcreteUser> users = new ArrayList<>(userCollection.getAllUsers());
        ConcreteUser user1 = users.get(0);
        ConcreteUser user2 = users.get(1);
        ConcreteUser user3 = users.get(2);
        ConcreteUser user4 = users.get(3);

        System.out.println("==========Message for everyone=======");
        user1.sendMessageAll("Hello everybody");
        System.out.println("==========Message for admins=======");
        user2.sendMessage("Hello admins", "Admin");
        System.out.println("==========Message for moderators=======");
        user3.sendMessage("Hello moderators", "moderator");
        System.out.println("==========Message for concrete user=======");
        user4.sendMessage("Hello, " + user1.getId(), user1.getId());
    }

}
