package behavioural.visitor;

public class Defense implements Action {
    @Override
    public void executeWarriorAction(Warrior element) {
        System.out.println("Use shield to protect team members");
    }

    @Override
    public void executeThiefAction(Thief element) {
        System.out.println("Try to dodge this attack");
    }

    @Override
    public void executeBlackMageAction(BlackMage element) {
        System.out.println("Nothing to do");
    }
}

