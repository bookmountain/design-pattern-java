package behavioural.chainofresponsibility;

public class RainbowBadgeDoorkeeper extends Doorkeeper {
    public RainbowBadgeDoorkeeper() {
        super("彩虹徽章檢查者");
    }

    @Override
    public boolean check(Player player) {
        System.out.println("我是 " + name + "，負責檢查是否有彩虹徽章");
        Badge badge = player.showBadge("Rainbow");

        if (badge == null) {
            System.out.println("你未持有彩虹徽章，不能通過此門\n");
            return false;
        }

        System.out.println("你持有彩虹徽章，請通過此門\n");
        return nextDoorkeeper.check(player);
    }
}
