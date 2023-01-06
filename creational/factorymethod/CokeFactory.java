package creational.factorymethod;

public class CokeFactory implements PETBottleFactory {
    @Override
    public PETBottle getPET_Bottle() {
        System.out.println("機器選定可樂瓶子");
        System.out.println("黑色液體衝入瓶子內");
        System.out.println("轉上瓶蓋，完成");
        return new Coke("甜甜的", "黑色");
    }
}

