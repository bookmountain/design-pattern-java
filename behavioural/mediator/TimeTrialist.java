package behavioural.mediator;

public class TimeTrialist implements Player {
    private final String name;
    private final String job = "TimeTrialist";
    private Mediator mediator;

    public TimeTrialist(String name) {
        this.name = name;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getJob() {
        return job;
    }

    public void teamChangeFormation(int type) {
        mediator.changeFormation(type);
    }

    public void changeFormation(int position) {
        System.out.println(job + " 收到通知，移動到車隊的第 " + position + " 個位置");
    }

    public void teamAccelerate() {
        mediator.accelerate();
    }

    public void personalAccelerate() {
        System.out.println("車手 " + name + " 收到通知，開始加速");
    }

    public void teamDecelerate() {
        mediator.decelerate();
    }

    public void personalDecelerate() {
        System.out.println("車手 " + name + " 收到通知，開始減速");
    }

    public void notifyTeamMembers(String message) {
        mediator.notifyTeamMembers(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println("車手 " + name + " 收到： " + message);
    }
}

