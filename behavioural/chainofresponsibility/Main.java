package behavioural.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("小智");
        player.addNewBadge(new Badge("Boulder"));
        player.addNewBadge(new Badge("Cascade"));
        player.addNewBadge(new Badge("Thunder"));
        player.addNewBadge(new Badge("Rainbow"));
        player.addNewBadge(new Badge("Soul"));
        player.addNewBadge(new Badge("Marsh"));
        player.addNewBadge(new Badge("Volcano"));
        player.addNewBadge(new Badge("Earth"));

        Doorkeeper boulderBadgeDoorkeeper = new BoulderBadgeDoorkeeper();
        Doorkeeper cascadeBadgeDoorkeeper = new CascadeBadgeDoorkeeper();
        Doorkeeper thunderBadgeDoorkeeper = new ThunderBadgeDoorkeeper();
        Doorkeeper rainbowBadgeDoorkeeper = new RainbowBadgeDoorkeeper();
        Doorkeeper soulBadgeDoorkeeper = new SoulBadgeDoorkeeper();
        Doorkeeper marshBadgeDoorkeeper = new MarshBadgeDoorkeeper();
        Doorkeeper volcanoBadgeDoorkeeper = new VolcanoBadgeDoorkeeper();
        Doorkeeper earthBadgeDoorkeeper = new EarthBadgeDoorkeeper();

        boulderBadgeDoorkeeper.setNextDoorkeeper(cascadeBadgeDoorkeeper);
        cascadeBadgeDoorkeeper.setNextDoorkeeper(thunderBadgeDoorkeeper);
        thunderBadgeDoorkeeper.setNextDoorkeeper(rainbowBadgeDoorkeeper);
        rainbowBadgeDoorkeeper.setNextDoorkeeper(soulBadgeDoorkeeper);
        soulBadgeDoorkeeper.setNextDoorkeeper(marshBadgeDoorkeeper);
        marshBadgeDoorkeeper.setNextDoorkeeper(volcanoBadgeDoorkeeper);
        volcanoBadgeDoorkeeper.setNextDoorkeeper(earthBadgeDoorkeeper);

        boolean check = boulderBadgeDoorkeeper.check(player);

        if (check) {
            System.out.println("挑戰者 " + player.getName() + " 通過冠軍之路");
        } else {
            System.out.println("請繼續挑戰各地的道館，直到獲得八個徽章吧");
        }
    }
}
