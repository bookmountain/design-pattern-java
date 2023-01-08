package behavioural.command;

public class CreatePaladinCommand extends Command {
    private final String name = "生產遊俠";

    public CreatePaladinCommand(Headquarters headquarters) {
        super(headquarters);
    }

    @Override
    public void executeCommand() {
        headquarters.createPaladin();
    }

    @Override
    public String getName() {
        return name;
    }
}

