package creational.simplefactorymethod;

public class Coke extends PETBottle {
    @Override
    public String getTaste() {
        return "這瓶可樂的顏色：" + color + "，香味是：" + smell;
    }
}
