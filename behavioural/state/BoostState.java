package behavioural.state;

public class BoostState implements State {
    private Hero hero;

    public BoostState(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void tryToShot() {
        hero.doNothing();
    }

    @Override
    public void tryToKick() {
        hero.doNothing();
    }

    @Override
    public void tryToJump() {
        hero.jump();
    }

    @Override
    public void tryToMovingToRight() {
        hero.moveToRight();
    }

    @Override
    public void tryToMovingToLeft() {
        hero.moveToLeft();
    }

    @Override
    public void tryToDoSomething() {
        hero.doNothing();
    }

    @Override
    public void tryToBecomeSnipperMode() {
        hero.changeState(new BoostState(hero));
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