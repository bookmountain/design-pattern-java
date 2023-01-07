package structural.bridge;

public class SingleTraveler implements Traveler {
    private String name;
    private Train ticket;

    public SingleTraveler(String name) {
        this.name = name;
    }

    @Override
    public void checkTicket(Train train) {
        this.ticket = train;
        System.out.println("我是 " + name + "，確認車種為：" + ticket.checkName());
    }

    @Override
    public void getJourney() {
        System.out.println("本人 " + name + " 的旅途即將開始");
        ticket.getEmergencies();
    }
}
