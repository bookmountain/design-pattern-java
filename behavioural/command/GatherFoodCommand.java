package behavioural.command;

public class GatherFoodCommand extends Command {
    private final String name = "採集食物";

    public GatherFoodCommand(Headquarters headquarters) {
        super(headquarters);
    }

    @Override
    public void executeCommand() {
        headquarters.gatherFood();
    }

    @Override
    public String getName() {
        return name;
    }
}
