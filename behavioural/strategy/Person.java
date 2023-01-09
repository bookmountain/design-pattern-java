package behavioural.strategy;

public class Person {
    private String name;
    private boolean hasStudentID;

    public Person(String name, boolean hasStudentID) {
        this.name = name;
        this.hasStudentID = hasStudentID;
    }

    public String getName() {
        return name;
    }

    public boolean isHasStudentID() {
        return hasStudentID;
    }
}
