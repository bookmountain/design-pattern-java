package behavioural.command;

public class CreateVillagerCommand extends Command {
    private final String name = "生產村民";

    public CreateVillagerCommand(Headquarters headquarters) {
        super(headquarters);
    }

    @Override
    public void executeCommand() {
        headquarters.createVillager();
    }

    @Override
    public String getName() {
        return name;
    }
}

