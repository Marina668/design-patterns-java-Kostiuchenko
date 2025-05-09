public interface User {
    void sendMessageAll(String message);
    void sendMessage(String message, String userTo);
    void receiveMassage(String message, User userFrom);
}
