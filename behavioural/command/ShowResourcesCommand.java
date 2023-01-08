package behavioural.command;

public class ShowResourcesCommand extends Command {
    private final String name = "顯示資源、建築與單位";

    public ShowResourcesCommand(Headquarters headquarters) {
        super(headquarters);
    }

    @Override
    public void executeCommand() {
        headquarters.showResources();
    }

    @Override
    public String getName() {
        return name;
    }
}
