package behavioural.chainofresponsibility;

public class SoulBadgeDoorkeeper extends Doorkeeper {
    public SoulBadgeDoorkeeper() {
        super("粉紅徽章檢查者");
    }

    @Override
    public boolean check(Player player) {
        System.out.println("我是 " + name + "，負責檢查是否有粉紅徽章");
        Badge badge = player.showBadge("Soul");

        if (badge == null) {
            System.out.println("你未持有粉紅徽章，不能通過此門\n");
            return false;
        }

        System.out.println("你持有粉紅徽章，請通過此門\n");
        return nextDoorkeeper.check(player);
    }
}
