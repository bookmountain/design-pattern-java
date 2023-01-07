package structural.bridge;

public class FamilyTraveler implements Traveler {
    private String name;
    private int children;
    private Train ticket;

    public FamilyTraveler(String name, int childrenCount) {
        this.name = name;
        this.children = childrenCount;
    }

    @Override
    public void checkTicket(Train train) {
        this.ticket = train;
        System.out.println("我是 " + name + "，確認車種為：" + ticket.checkName());
    }

    @Override
    public void getJourney() {
        System.out.println("與 " + children + " 個孩子的旅途即將開始");
        ticket.getEmergencies();
    }
}

