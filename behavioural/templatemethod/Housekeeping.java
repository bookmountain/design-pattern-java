package behavioural.templatemethod;

public abstract class Housekeeping {
    protected String type;

    Housekeeping(String type) {
        this.type = type;
    }

    public String washClothes() {
        return washDetails();
    }

    protected abstract String washDetails();

    public String cleanUp() {
        return cleanUpDetails();
    }

    protected abstract String cleanUpDetails();
}
