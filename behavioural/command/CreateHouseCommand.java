package behavioural.command;

public class CreateHouseCommand extends Command {
    private final String name = "建造居住房舍";

    public CreateHouseCommand(Headquarters headquarters) {
        super(headquarters);
    }

    @Override
    public void executeCommand() {
        headquarters.createHouse();
    }

    @Override
    public String getName() {
        return name;
    }
}
