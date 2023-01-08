package behavioural.chainofresponsibility;

public class CascadeBadgeDoorkeeper extends Doorkeeper {
    public CascadeBadgeDoorkeeper() {
        super("藍色徽章檢查者");
    }

    @Override
    public boolean check(Player player) {
        System.out.println("我是 " + name + "，負責檢查是否有藍色徽章");
        Badge badge = player.showBadge("Cascade");

        if (badge == null) {
            System.out.println("你未持有藍色徽章，不能通過此門\n");
            return false;
        }

        System.out.println("你持有藍色徽章，請通過此門\n");
        return nextDoorkeeper.check(player);
    }
}
