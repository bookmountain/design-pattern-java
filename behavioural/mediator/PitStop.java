package behavioural.mediator;

public class PitStop implements Mediator {
    private Sprinter sprinter;
    private Domestique domestique;
    private TimeTrialist timeTrialist;
    private ClimbingSpecialist climbingSpecialist;

    @Override
    public void registerPlayer(Player player) {
        player.setMediator(this);

        switch (player.getJob()) {
            case "Sprinter":
                sprinter = (Sprinter) player;
                break;
            case "Domestique":
                domestique = (Domestique) player;
                break;
            case "TimeTrialist":
                timeTrialist = (TimeTrialist) player;
                break;
            case "ClimbingSpecialist":
                climbingSpecialist = (ClimbingSpecialist) player;
                break;
        }

    }

    @Override
    public void changeFormation(int type) {
        switch (type) {
            case 1:
                sprinter.changeFormation(1);
                domestique.changeFormation(2);
                timeTrialist.changeFormation(3);
                climbingSpecialist.changeFormation(4);
                break;
            case 2:
                domestique.changeFormation(1);
                timeTrialist.changeFormation(2);
                climbingSpecialist.changeFormation(3);
                sprinter.changeFormation(4);
                break;
            case 3:
                climbingSpecialist.changeFormation(1);
                domestique.changeFormation(2);
                sprinter.changeFormation(3);
                timeTrialist.changeFormation(4);
                break;
            case 4:
                timeTrialist.changeFormation(1);
                climbingSpecialist.changeFormation(2);
                sprinter.changeFormation(3);
                domestique.changeFormation(4);
                break;
        }

        System.out.println();
    }

    @Override
    public void accelerate() {
        sprinter.personalAccelerate();
        domestique.personalAccelerate();
        timeTrialist.personalAccelerate();
        climbingSpecialist.personalAccelerate();
        System.out.println();
    }

    @Override
    public void decelerate() {
        sprinter.personalDecelerate();
        domestique.personalDecelerate();
        timeTrialist.personalDecelerate();
        climbingSpecialist.personalDecelerate();
        System.out.println();
    }

    @Override
    public void notifyTeamMembers(String message, Player requester) {
        String finalMessage = "車手： " + requester.getName() + " 通知： " + message;

        switch (requester.getJob()) {
            case "Sprinter":
                domestique.receiveMessage(finalMessage);
                timeTrialist.receiveMessage(finalMessage);
                climbingSpecialist.receiveMessage(finalMessage);
                break;
            case "Domestique":
                sprinter.receiveMessage(finalMessage);
                timeTrialist.receiveMessage(finalMessage);
                climbingSpecialist.receiveMessage(finalMessage);
                break;
            case "TimeTrialist":
                sprinter.receiveMessage(finalMessage);
                domestique.receiveMessage(finalMessage);
                climbingSpecialist.receiveMessage(finalMessage);
                break;
            case "ClimbingSpecialist":
                sprinter.receiveMessage(finalMessage);
                domestique.receiveMessage(finalMessage);
                timeTrialist.receiveMessage(finalMessage);
                break;
        }

        System.out.println();
    }

}
