package structural.proxy;

public class User {
    private final String id;
    private final String name;
    private final String level;

    public User(String id, String name, String level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }
}