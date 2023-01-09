package behavioural.visitor;

public interface Action {
    public abstract void executeWarriorAction(Warrior element);

    public abstract void executeThiefAction(Thief element);

    public abstract void executeBlackMageAction(BlackMage element);
}
