package structural.decorator;

public class Activity extends Commuter {
    protected Commuter commuter;

    public Activity() {
    }

    public Activity(Commuter commuter) {
        this.commuter = commuter;
    }

    public void commuterDecorate(Commuter commuter) {
        this.commuter = commuter;
    }

    @Override
    public void claimDestination() {
        if (commuter != null) {
            commuter.claimDestination();
        }
    }

    @Override
    public void commute() {
        if (commuter != null) {
            commuter.commute();
        }
    }
}
