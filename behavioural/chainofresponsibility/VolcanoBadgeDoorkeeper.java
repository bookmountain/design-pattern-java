package behavioural.chainofresponsibility;

public class VolcanoBadgeDoorkeeper extends Doorkeeper {
    public VolcanoBadgeDoorkeeper() {
        super("深紅徽章檢查者");
    }

    @Override
    public boolean check(Player player) {
        System.out.println("我是 " + name + "，負責檢查是否有深紅徽章");
        Badge badge = player.showBadge("Volcano");

        if (badge == null) {
            System.out.println("你未持有深紅徽章，不能通過此門\n");
            return false;
        }

        System.out.println("你持有深紅徽章，請通過此門\n");
        return nextDoorkeeper.check(player);
    }
}
