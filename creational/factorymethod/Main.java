package creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("今天我想來點，可樂！");
        PETBottleFactory cokeFactory = new CokeFactory();
        PETBottle coke = cokeFactory.getPET_Bottle();
        System.out.println("得到一瓶可樂！");
        System.out.println(coke.getTaste());
        System.out.println("---咳咳咳---");

        System.out.println("有點甜，我想喝點，礦泉水！");
        PETBottleFactory waterFactory = new WaterFactory();
        PETBottle water = waterFactory.getPET_Bottle();
        System.out.println("得到一瓶礦泉水！");
        System.out.println(water.getTaste());

        System.out.println("---咕嚕咕嚕---");

        System.out.println("清爽！最來來點，柳橙汁！");
        PETBottleFactory orangeJuiceFactory = new OrangeJuiceFactory();
        PETBottle orangeJuice = orangeJuiceFactory.getPET_Bottle();
        System.out.println("得到一瓶柳橙汁！");
        System.out.println(orangeJuice.getTaste());
    }
}
