package behavioural.command;

public class RemovePaladinCommand extends Command {
    private final String name = "刪除遊俠";

    public RemovePaladinCommand(Headquarters headquarters) {
        super(headquarters);
    }

    @Override
    public void executeCommand() {
        headquarters.removePaladin();
    }

    @Override
    public String getName() {
        return name;
    }
}
