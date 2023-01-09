package behavioural.visitor;

public class Magic implements Action {
    @Override
    public void executeWarriorAction(Warrior element) {
        System.out.println("There is no mana");
    }

    @Override
    public void executeThiefAction(Thief element) {
        System.out.println("There is no mana");
    }

    @Override
    public void executeBlackMageAction(BlackMage element) {
        System.out.println("Use fire ball!!!");
    }
}