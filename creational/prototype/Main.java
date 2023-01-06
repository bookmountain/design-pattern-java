package creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("進行第一項產品的嘗試");
        NewTasteBeverage beverage1 = new NewTasteBeverage("可樂");
        beverage1.setSize("350毫升");
        beverage1.setTaste("香草");
        beverage1.setProduceInfo("桃園", "臺灣");
        beverage1.setSeriesNumber("3617263");

        System.out.println("更換，進行第二項");
        NewTasteBeverage beverage2 = (NewTasteBeverage) beverage1.clone();
        beverage2.setTaste("檸檬");
        beverage2.setSeriesNumber("8911733");

        System.out.println("更換，進行最後一項");
        NewTasteBeverage beverage3 = (NewTasteBeverage) beverage1.clone();
        beverage3.setProduceInfo("臺中", "臺灣");
        beverage3.setSeriesNumber("1657209");

        beverage1.showInfo();
        beverage2.showInfo();
        beverage3.showInfo();
    }
}