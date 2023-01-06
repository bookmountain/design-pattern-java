package creational.factorymethod;

public class Water extends PETBottle {
    public Water(String smell, String color) {
        super(smell, color);
    }

    @Override
    public String getTaste() {
        return "這瓶水的顏色：" + color + "，香味是：" + smell;
    }
}
