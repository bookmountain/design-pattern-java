package behavioural.chainofresponsibility;

import java.util.HashMap;

public class Player {
    private final String name;
    private final HashMap<String, Badge> badgeBox = new HashMap<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNewBadge(Badge badge) {
        badgeBox.put(badge.show(), badge);
    }

    public Badge showBadge(String badgeName) {
        return badgeBox.get(badgeName);
    }
}
