package behavioural.command;

public class RemoveVillagerCommand extends Command {
    private final String name = "刪除村民";

    public RemoveVillagerCommand(Headquarters headquarters) {
        super(headquarters);
    }

    @Override
    public void executeCommand() {
        headquarters.removeVillager();
    }

    @Override
    public String getName() {
        return name;
    }
}

