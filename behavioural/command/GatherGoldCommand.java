package behavioural.command;

public class GatherGoldCommand extends Command {
    private final String name = "挖金礦";

    public GatherGoldCommand(Headquarters headquarters) {
        super(headquarters);
    }

    @Override
    public void executeCommand() {
        headquarters.gatherGold();
    }

    @Override
    public String getName() {
        return name;
    }
}

