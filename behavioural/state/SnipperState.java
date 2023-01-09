package behavioural.state;

public class SnipperState implements State {
    private Hero hero;

    public SnipperState(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void tryToShot() {
        hero.shot();
    }

    @Override
    public void tryToKick() {
        hero.doNothing();
    }

    @Override
    public void tryToJump() {
        hero.doNothing();
    }

    @Override
    public void tryToMovingToRight() {
        hero.doNothing();
    }

    @Override
    public void tryToMovingToLeft() {
        hero.doNothing();
    }

    @Override
    public void tryToDoSomething() {
        hero.doNothing();
    }

    @Override
    public void tryToBecomeSnipperMode() {
        hero.changeState(new SnipperState(hero));
    }

    @Override
    public void tryToBecomeStandingMode() {
        hero.changeState(new StandingState(hero));
    }

    @Override
    public void tryToBecomeBoostMode() {
        hero.changeState(new BoostState(hero));
    }
}
