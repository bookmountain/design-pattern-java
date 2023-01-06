package creational.factorymethod;

public class OrangeJuiceFactory implements PETBottleFactory {
    @Override
    public PETBottle getPET_Bottle() {
        System.out.println("機器選定礦泉柳橙汁瓶子");
        System.out.println("橘色液體衝入瓶子內");
        System.out.println("轉上瓶蓋，完成");
        return new OrangeJuice("酸酸的", "橘色");
    }
}