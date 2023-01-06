package creational.factorymethod;

public class WaterFactory implements PETBottleFactory {
    @Override
    public PETBottle getPET_Bottle() {
        System.out.println("機器選定礦泉水瓶子");
        System.out.println("透明液體衝入瓶子內");
        System.out.println("轉上瓶蓋，完成");
        return new Water("無味", "透明的");
    }
}