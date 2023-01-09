package behavioural.visitor;

public class Attack implements Action {
    @Override
    public void executeWarriorAction(Warrior element) {
        System.out.println("Use sword to attack enemy");
    }

    @Override
    public void executeThiefAction(Thief element) {
        System.out.println("Use dagger to stab enemy");
    }

    @Override
    public void executeBlackMageAction(BlackMage element) {
        System.out.println("It's is wrong decision");
    }
}
