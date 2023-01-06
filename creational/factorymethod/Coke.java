package creational.factorymethod;

public class Coke extends PETBottle {
    public Coke(String smell, String color) {
        super(smell, color);
    }

    @Override
    public String getTaste() {
        return "這瓶可樂的顏色：" + color + "，香味是：" + smell;
    }
}
