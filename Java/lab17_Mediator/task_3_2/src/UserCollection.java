import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserCollection {
    protected final Map<String, ConcreteUser> users = new HashMap<>();

    public void addUser(ConcreteUser user) {
        users.put(user.getId(), user);
    }

    public boolean contain(String user) {
        return users.containsKey(user);
    }

    public User getUser(String user) {
        return users.get(user);

    }

    public Collection<ConcreteUser> getAllUsers() {
        return users.values();
    }
}
