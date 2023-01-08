package behavioural.command;

public abstract class Command {
    protected Headquarters headquarters;

    protected Command(Headquarters headquarters) {
        this.headquarters = headquarters;
    }

    public abstract void executeCommand();

    public abstract String getName();
}
