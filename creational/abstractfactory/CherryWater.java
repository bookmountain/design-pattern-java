package creational.abstractfactory;

public class CherryWater extends Water {
    public CherryWater() {
        super("櫻桃味道");
    }

    @Override
    public String getTaste() {
        return "這瓶人工櫻桃風味礦泉水的顏色：" + color + "，香味是：" + smell;
    }
}