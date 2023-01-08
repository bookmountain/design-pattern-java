package behavioural.command;

public class RemoveHouseCommand extends Command {
    private final String name = "刪除居住房舍";

    public RemoveHouseCommand(Headquarters headquarters) {
        super(headquarters);
    }

    @Override
    public void executeCommand() {
        headquarters.removeHouse();
    }

    @Override
    public String getName() {
        return name;
    }
}
