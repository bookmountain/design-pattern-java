package structural.bridge;

public interface Train {
    public abstract String checkName();

    public abstract boolean isOnTime();

    public abstract void setTime(int min);

    public abstract void goToDestination();

    public abstract boolean getToiletStatus();

    public abstract void setToiletStatus(boolean using);

    public abstract void moveOn();

    public abstract void stop();

    public abstract void getFoodByTrolleyService();

    public abstract void timeNeedToArrive();

    public abstract void getEmergencies();
}
