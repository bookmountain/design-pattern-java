package behavioural.state;

public interface State {
    public abstract void tryToShot();

    public abstract void tryToKick();

    public abstract void tryToJump();

    public abstract void tryToMovingToRight();

    public abstract void tryToMovingToLeft();

    public abstract void tryToDoSomething();

    public abstract void tryToBecomeSnipperMode();

    public abstract void tryToBecomeStandingMode();

    public abstract void tryToBecomeBoostMode();
}
