package behavioural.command;

public class GatherWoodCommand extends Command {
    private final String name = "砍樹";

    public GatherWoodCommand(Headquarters headquarters) {
        super(headquarters);
    }

    @Override
    public void executeCommand() {
        headquarters.gatherWood();
    }

    @Override
    public String getName() {
        return name;
    }
}
