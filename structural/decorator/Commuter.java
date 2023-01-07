package structural.decorator;

public class Commuter {
    private String name;

    private String destination;

    public Commuter() {
    }

    public Commuter(String name, String destination) {
        this.name = name;
        this.destination = destination;
    }

    public void claimDestination() {
        System.out.println("目的地： " + destination + " 已經抵達，準備下車");
    }

    public void commute() {
        System.out.println("我是 " + name + "，是一位通勤者");
    }
}
