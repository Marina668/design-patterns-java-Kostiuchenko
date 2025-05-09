import java.util.Collection;

public class ModeratorMediator extends ConcreteUserMediator {
    @Override
    public void broadcast(String message, User userFrom, String userTo) {
        if(super.isCollectionChosen()) {
            if (userTo.equalsIgnoreCase("moderator")) {
                Collection<ConcreteUser> users = userCollection.getAllUsers();
                for (ConcreteUser user : users) {
                    if (user.getType().equalsIgnoreCase("moderator")) {
                        user.receiveMassage(message, userFrom);
                    }
                }
            } else {
                super.broadcast(message, userFrom, userTo);
            }
        }else{
            System.out.println("ModeratorMediator: No users found!");
        }
    }
}
