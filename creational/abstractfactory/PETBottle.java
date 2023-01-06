package creational.abstractfactory;

public abstract class PETBottle {
    protected String smell = "";
    protected String color = "";

    protected PETBottle(String smell, String color) {
        this.smell = smell;
        this.color = color;
    }

    public abstract String getTaste();
}