package behavioural.strategy;

public class Main {
    public static void main(String[] args) throws Exception {
        ZoomTicketVendingMachine ticketMachine = new ZoomTicketVendingMachine();

        System.out.println("---一家四口，兩大兩小---");
        ticketMachine.addPerson(new Person(NameSelector.exec("m"), false));
        ticketMachine.addPerson(new Person(NameSelector.exec("f"), false));
        ticketMachine.addPerson(new Person(NameSelector.exec("m"), true));
        ticketMachine.addPerson(new Person(NameSelector.exec("f"), true));
        int familyFees = ticketMachine.calculateFees();
        System.out.println("家庭的總金額是： " + familyFees);

        ticketMachine.clear();
        System.out.println("---戶外教學，兩個導師以及三十八個學生---");
        ticketMachine.addPerson(new Person(NameSelector.exec("m"), false));
        ticketMachine.addPerson(new Person(NameSelector.exec("f"), false));

        for (int i = 0; i < 19; i++) {
            ticketMachine.addPerson(new Person(NameSelector.exec("f"), true));
        }

        for (int i = 0; i < 19; i++) {
            ticketMachine.addPerson(new Person(NameSelector.exec("m"), true));
        }

        int schoolTripFees = ticketMachine.calculateFees();
        System.out.println("校外教學的總金額是： " + schoolTripFees);
    }
}
