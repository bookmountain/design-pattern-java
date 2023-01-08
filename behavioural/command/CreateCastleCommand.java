package behavioural.command;

public class CreateCastleCommand extends Command {
    private final String name = "建造城堡";

    public CreateCastleCommand(Headquarters headquarters) {
        super(headquarters);
    }

    @Override
    public void executeCommand() {
        headquarters.createCastle();
    }

    @Override
    public String getName() {
        return name;
    }
}

