package creational.simplefactorymethod;

public abstract class PETBottle {
    protected String smell = "";
    protected String color = "";

    public void setBottle(String smell, String color) {
        this.smell = smell;
        this.color = color;
    }

    public abstract String getTaste();
}