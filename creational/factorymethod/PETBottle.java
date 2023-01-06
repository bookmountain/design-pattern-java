package creational.factorymethod;

public abstract class PETBottle {
    protected String smell = "";
    protected String color = "";

    public PETBottle(String smell, String color) {
        this.smell = smell;
        this.color = color;
    }

    public abstract String getTaste();
}