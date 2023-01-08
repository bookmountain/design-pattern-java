package behavioural.chainofresponsibility;

public class Badge {
    private final String name;

    public Badge(String name) {
        this.name = name;
    }

    public String show() {
        return name;
    }
}
