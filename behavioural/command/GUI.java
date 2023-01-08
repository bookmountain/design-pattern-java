package behavioural.command;

import java.util.ArrayList;
import java.util.Date;

public class GUI {
    private final ArrayList<Command> orders;

    public GUI() {
        this.orders = new ArrayList<>();
    }

    public void receivePlayerCommand(Command command) {
        orders.add(command);
        System.out.println("接收指令： " + command.getName() + " 時間:" + new Date());
    }

    public void cancelPlayerCommand(Command command) {
        orders.remove(command);
        System.out.println("取消指令： " + command.getName() + " 時間:" + new Date());
    }

    public void executePlayerCommands() {
        for (Command command : orders) {
            command.executeCommand();
        }
    }
}
