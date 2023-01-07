package structural.bridge;

public class Main {
    public static void main(String[] args) {
        System.out.println("---一人的旅程開始---");
        System.out.println("這次的車種是：區間車");
        SingleTraveler singleTraveler = new SingleTraveler("維特");
        singleTraveler.checkTicket(new LocalTrain());
        singleTraveler.getJourney();

        System.out.println("\n---下一組是家庭的旅程---");
        System.out.println("車種為：普悠瑪");
        FamilyTraveler familyTraveler = new FamilyTraveler("羅傑", 3);
        familyTraveler.checkTicket(new PuyumaExpress());
        familyTraveler.getJourney();

        System.out.println("\n---最後是外國人的旅程---");
        System.out.println("雖然想家，仍把握機會搭乘：太魯閣");
        ForeignTraveler foreignTraveler = new ForeignTraveler("David", "US");
        foreignTraveler.checkTicket(new TarokoExpress());
        foreignTraveler.getJourney();
    }
}
