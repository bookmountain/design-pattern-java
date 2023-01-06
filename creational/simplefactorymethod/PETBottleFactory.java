package creational.simplefactorymethod;

public class PETBottleFactory {
    public static PETBottle getPETBottle(String option) throws Exception {

        return switch (option) {
            case "Coke" -> new Coke();
            case "Water" -> new Water();
            case "OrangeJuice" -> new OrangeJuice();
            default -> throw new Exception("輸入錯誤");
        };
    }
}
