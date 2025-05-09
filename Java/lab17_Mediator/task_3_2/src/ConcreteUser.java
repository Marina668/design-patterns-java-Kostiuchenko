public class ConcreteUser implements User {

    final private String userId;
    private Mediator mediator;
    final private String userType;

    public ConcreteUser(String userId, String userType) {
        this.userId = userId;
        this.userType = userType;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getType() {
        return userType;
    }

    public String getId() {
        return userId;
    }

    @Override
    public void sendMessageAll(String message) {
        mediator.broadcast(message, this, "all");
    }

    @Override
    public void sendMessage(String message, String userTo) {
        mediator.broadcast(message, this, userTo);
    }

    @Override
    public void receiveMassage(String message, User userFrom) {
        System.out.println("User " + userId + " receives message: " + message + " from user " + userFrom);
    }
}
