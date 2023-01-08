package behavioural.chainofresponsibility;

public class EarthBadgeDoorkeeper extends Doorkeeper {
    public EarthBadgeDoorkeeper() {
        super("綠色徽章檢查者");
    }

    @Override
    public boolean check(Player player) {
        System.out.println("我是 " + name + "，負責檢查是否有綠色徽章");
        Badge badge = player.showBadge("Earth");

        if (badge == null) {
            System.out.println("你未持有綠色徽章，不能通過此門");
            return false;
        }

        System.out.println("你持有綠色徽章，請通過此門\n");
        return true;
    }
}