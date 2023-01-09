package behavioural.state;

public class VideoGameController {
    private Hero hero;

    public VideoGameController(Hero hero) {
        this.hero = hero;
    }

    public void pushButtonY() {
        hero.tryToShot();
    }

    public void pushButtonX() {
        hero.tryToKick();
    }

    public void pushButtonB() {
        hero.tryToJump();
    }

    public void pushButtonA() {
        hero.tryToDoSomething();
    }

    public void pushButtonRightArrow() {
        hero.tryToMovingToRight();
    }

    public void pushButtonLeftArrow() {
        hero.tryToMovingToLeft();
    }

    public void holdButtonR() {
        hero.tryToBecomeSnipperMode();
    }

    public void releaseButtonR() {
        hero.tryToBecomeStandingMode();
    }

    public void holdButtonL() {
        hero.tryToBecomeBoostMode();
    }

    public void releaseButtonL() {
        hero.tryToBecomeStandingMode();
    }
}
