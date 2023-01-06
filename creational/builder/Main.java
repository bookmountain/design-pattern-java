package creational.builder;

public class Main {
    public static void main(String[] args) {
        BeverageDirector beverageDirector = new BeverageDirector();

        // 生產可樂
        System.out.println("---上午的生產目標是可樂---");
        CokeBuilder cokeBuilder = new CokeBuilder();
        beverageDirector.setBeverageBuilder(cokeBuilder);
        beverageDirector.produceBeverage();
        System.out.println("---上午目標已完成---\n");

        // 生產礦泉水
        System.out.println("---下午的生產目標是礦泉水---");
        WaterBuilder watBuilder = new WaterBuilder();
        beverageDirector.setBeverageBuilder(watBuilder);
        beverageDirector.produceBeverage();
        System.out.println("---下午目標已完成---\n");

        // 生產柳橙汁
        System.out.println("---晚上的生產目標是柳橙汁---");
        OrangeJuiceBuilder orangeJuiceBuilder = new OrangeJuiceBuilder();
        beverageDirector.setBeverageBuilder(orangeJuiceBuilder);
        beverageDirector.produceBeverage();
        System.out.println("---晚上目標已完成---");
    }
}