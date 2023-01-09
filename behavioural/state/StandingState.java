package behavioural.state;

public class StandingState implements State {
    private Hero hero;

    public StandingState(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void tryToShot() {
        hero.shot();
    }

    @Override
    public void tryToKick() {
        hero.kick();
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
