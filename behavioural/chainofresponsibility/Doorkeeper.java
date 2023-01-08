package behavioural.chainofresponsibility;

public abstract class Doorkeeper {
    protected String name;

    protected Doorkeeper nextDoorkeeper;

    protected Doorkeeper(String name) {
        this.name = name;
    }

    public void setNextDoorkeeper(Doorkeeper doorkeeper) {
        this.nextDoorkeeper = doorkeeper;
    }

    public abstract boolean check(Player player);
}