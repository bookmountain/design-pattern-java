package behavioural.visitor;

public class Run implements Action {
    @Override
    public void executeWarriorAction(Warrior element) {
        System.out.println("The last one to run");
    }

    @Override
    public void executeThiefAction(Thief element) {
        System.out.println("The fast one to run");
    }

    @Override
    public void executeBlackMageAction(BlackMage element) {
        System.out.println("The slow one to run");
    }
}