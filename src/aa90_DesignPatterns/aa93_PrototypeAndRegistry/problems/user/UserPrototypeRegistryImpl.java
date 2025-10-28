package aa90_DesignPatterns.aa93_PrototypeAndRegistry.problems.user;

import java.util.HashMap;
import java.util.Map;

public class UserPrototypeRegistryImpl implements UserPrototypeRegistry {

    Map<UserType, User> userMap = new HashMap<>();
    @Override
    public void addPrototype(User user) {
        userMap.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type) {
        return userMap.get(type);
    }

    @Override
    public User clone(UserType type) {
        return userMap.get(type).cloneObject();
    }

}