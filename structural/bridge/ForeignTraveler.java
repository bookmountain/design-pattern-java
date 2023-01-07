package structural.bridge;

public class ForeignTraveler implements Traveler {
    private String name;
    private String country;
    private Train ticket;

    public ForeignTraveler(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public void checkTicket(Train train) {
        this.ticket = train;
        System.out.println("My name is " + name + "，the train is：" + ticket.checkName());
    }

    @Override
    public void getJourney() {
        System.out.println("I miss my country: " + country + " , but the new journey is so adorable");
        ticket.getEmergencies();
    }
}