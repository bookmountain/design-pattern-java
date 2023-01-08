package behavioural.command;

public class GatherStoneCommand extends Command {
    private final String name = "挖石礦";

    public GatherStoneCommand(Headquarters headquarters) {
        super(headquarters);
    }

    @Override
    public void executeCommand() {
        headquarters.gatherStone();
    }

    @Override
    public String getName() {
        return name;
    }
}