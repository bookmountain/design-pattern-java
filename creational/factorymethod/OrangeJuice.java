package creational.factorymethod;

public class OrangeJuice extends PETBottle {
    public OrangeJuice(String smell, String color) {
        super(smell, color);
    }

    @Override
    public String getTaste() {
        return "這瓶柳橙汁的顏色：" + color + "，香味是：" + smell;
    }
}