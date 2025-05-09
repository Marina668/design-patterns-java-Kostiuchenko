import java.util.Collection;

public class AllUsersMediator extends ConcreteUserMediator {
    @Override
    public void broadcast(String message, User userFrom, String userTo) {
        if(super.isCollectionChosen()) {
            if (userTo.equalsIgnoreCase("all")) {
                Collection<ConcreteUser> users = userCollection.getAllUsers();
                for (ConcreteUser user : users) {
                    user.receiveMassage(message, userFrom);
                }
            } else {
                super.broadcast(message, userFrom, userTo);
            }
        }else{
            System.out.println("AllUsersMediator: No users found!");
        }
    }
}