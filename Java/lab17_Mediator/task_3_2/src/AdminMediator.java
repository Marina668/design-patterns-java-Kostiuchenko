import java.util.Collection;

public class AdminMediator extends ConcreteUserMediator {

    @Override
    public void broadcast(String message, User userFrom, String userTo) {
        if(super.isCollectionChosen()) {
            if (userTo.equalsIgnoreCase("admin")) {
                Collection<ConcreteUser> users = userCollection.getAllUsers();
                for (ConcreteUser user : users) {
                    if (user.getType().equalsIgnoreCase("admin")) {
                        user.receiveMassage(message, userFrom);
                    }
                }
            } else {
                super.broadcast(message, userFrom, userTo);
            }
        }else{
            System.out.println("AdminMediator: No users found!");
        }
    }
}