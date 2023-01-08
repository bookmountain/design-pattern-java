package behavioural.command;

public class Main {
    public static void main(String[] args) {
        Headquarters headquarters = new Headquarters();
        Command createVillagerCommand = new CreateVillagerCommand(headquarters);
        Command createPaladinCommand = new CreatePaladinCommand(headquarters);
        Command createHouseCommand = new CreateHouseCommand(headquarters);
        Command createCastleCommand = new CreateCastleCommand(headquarters);
        Command gatherWoodCommand = new GatherWoodCommand(headquarters);
        Command gatherFoodCommand = new GatherFoodCommand(headquarters);
        Command gatherGoldCommand = new GatherGoldCommand(headquarters);
        Command gatherStoneCommand = new GatherStoneCommand(headquarters);
        Command showResourcesCommand = new ShowResourcesCommand(headquarters);
        GUI gui = new GUI();

        gui.receivePlayerCommand(createVillagerCommand);

        gui.receivePlayerCommand(createPaladinCommand);
        gui.receivePlayerCommand(gatherFoodCommand);
        gui.receivePlayerCommand(gatherFoodCommand);
        gui.receivePlayerCommand(gatherGoldCommand);
        gui.receivePlayerCommand(gatherGoldCommand);
        gui.receivePlayerCommand(createPaladinCommand);

        gui.receivePlayerCommand(createHouseCommand);
        gui.receivePlayerCommand(createHouseCommand);
        gui.receivePlayerCommand(createHouseCommand);
        gui.receivePlayerCommand(createHouseCommand);
        gui.receivePlayerCommand(createHouseCommand);
        gui.receivePlayerCommand(gatherWoodCommand);
        gui.receivePlayerCommand(createHouseCommand);
        gui.cancelPlayerCommand(createHouseCommand);
        gui.cancelPlayerCommand(createHouseCommand);

        gui.receivePlayerCommand(createCastleCommand);
        gui.receivePlayerCommand(gatherStoneCommand);
        gui.receivePlayerCommand(gatherStoneCommand);
        gui.receivePlayerCommand(gatherStoneCommand);
        gui.receivePlayerCommand(gatherStoneCommand);
        gui.receivePlayerCommand(gatherStoneCommand);
        gui.receivePlayerCommand(gatherStoneCommand);
        gui.receivePlayerCommand(gatherStoneCommand);
        gui.receivePlayerCommand(gatherStoneCommand);
        gui.cancelPlayerCommand(gatherStoneCommand);
        gui.receivePlayerCommand(createCastleCommand);

        gui.receivePlayerCommand(showResourcesCommand);

        gui.executePlayerCommands();
    }
}
