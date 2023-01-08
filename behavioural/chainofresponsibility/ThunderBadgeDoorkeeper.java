package behavioural.chainofresponsibility;

public class ThunderBadgeDoorkeeper extends Doorkeeper {
    public ThunderBadgeDoorkeeper() {
        super("橙色徽章檢查者");
    }

    @Override
    public boolean check(Player player) {
        System.out.println("我是 " + name + "，負責檢查是否有橙色徽章");
        Badge badge = player.showBadge("Thunder");

        if (badge == null) {
            System.out.println("你未持有橙色徽章，不能通過此門\n");
            return false;
        }

        System.out.println("你持有橙色徽章，請通過此門\n");
        return nextDoorkeeper.check(player);
    }
}
