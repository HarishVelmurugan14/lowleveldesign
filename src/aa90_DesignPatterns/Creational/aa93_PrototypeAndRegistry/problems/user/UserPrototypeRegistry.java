package aa90_DesignPatterns.Creational.aa93_PrototypeAndRegistry.problems.user;

public interface UserPrototypeRegistry {
    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}
