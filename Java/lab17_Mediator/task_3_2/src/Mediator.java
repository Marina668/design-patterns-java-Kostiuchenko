public interface Mediator {
    void setUserCollection(UserCollection userCollection);
    void setNext(Mediator mediator);
    void broadcast(String message, User userFrom, String userTo);
}
