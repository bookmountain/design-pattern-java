package behavioural.mediator;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new PitStop();
        Sprinter sprinter = new Sprinter("Roger");
        Domestique domestique = new Domestique("Victor");
        TimeTrialist timeTrialist = new TimeTrialist("David");
        ClimbingSpecialist climbingSpecialist = new ClimbingSpecialist("Eric");

        /** 註冊隊友 */
        mediator.registerPlayer(sprinter);
        mediator.registerPlayer(domestique);
        mediator.registerPlayer(timeTrialist);
        mediator.registerPlayer(climbingSpecialist);

        /** 要求加速 */
        sprinter.teamAccelerate();
        domestique.teamAccelerate();

        /** 要求減速 */
        timeTrialist.teamDecelerate();
        climbingSpecialist.teamChangeFormation(2);

        /** 通知隊友 */
        domestique.notifyTeamMembers("前方有大彎道，向右");

        /** 最後衝刺 */
        sprinter.teamChangeFormation(1);
        sprinter.notifyTeamMembers("抵達終點線");
    }

}
