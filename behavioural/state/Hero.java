package behavioural.state;

public class Hero {
    private State state;

    public Hero() {
        this.state = new StandingState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void tryToShot() {
        state.tryToShot();
    }

    public void shot() {
        System.out.println("英雄射出一發子彈");
    }

    public void tryToKick() {
        state.tryToKick();
    }

    public void kick() {
        System.out.println("英雄向前方踢了一腳");
    }

    public void tryToJump() {
        state.tryToJump();
    }

    public void jump() {
        System.out.println("英雄往上跳");
    }

    public void tryToMovingToRight() {
        state.tryToMovingToRight();
    }

    public void moveToRight() {
        System.out.println("英雄往右走");
    }

    public void tryToMovingToLeft() {
        state.tryToMovingToLeft();
    }

    public void moveToLeft() {
        System.out.println("英雄往左走");
    }

    public void tryToDoSomething() {
        state.tryToDoSomething();
    }

    public void doNothing() {
        System.out.println("什麼事也沒發生");
    }

    public void tryToBecomeSnipperMode() {
        state.tryToBecomeSnipperMode();
    }

    public void tryToBecomeStandingMode() {
        state.tryToBecomeStandingMode();
    }

    public void tryToBecomeBoostMode() {
        state.tryToBecomeBoostMode();
    }
}
