package behavioural.command;

public class RemoveCastleCommand extends Command {
    private final String name = "刪除城堡";

    public RemoveCastleCommand(Headquarters headquarters) {
        super(headquarters);
    }

    @Override
    public void executeCommand() {
        headquarters.removeCastle();
    }

    @Override
    public String getName() {
        return name;
    }
}

