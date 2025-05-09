

public class ConcreteUserMediator implements Mediator {
    protected UserCollection userCollection;
    protected Mediator next = null;

    @Override
    public void setUserCollection(UserCollection userCollection) {
        this.userCollection = userCollection;
    }

    public boolean isCollectionChosen() {
        return userCollection != null;
    }

    @Override
    public void setNext(Mediator mediator) {
        next = mediator;
    }

    @Override
    public void broadcast(String message, User userFrom, String userTo) {
        if (isCollectionChosen()) {
            if (next != null) {
                next.broadcast(message, userFrom, userTo);
            } else {
                if (userCollection.contain(userTo)) {
                    userCollection.getUser(userTo).receiveMassage(message, userFrom);
                } else {
                    System.out.println("User with id: " + userTo + " -- does not found! Check recipient data!");
                }
            }
        } else {
            System.out.println("ConcreteUserMediator: No users found!");
        }
    }
}
