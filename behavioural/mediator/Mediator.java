package behavioural.mediator;

public interface Mediator {
    void registerPlayer(Player player);

    void changeFormation(int type);

    void accelerate();

    void decelerate();

    void notifyTeamMembers(String message, Player requester);
}
