package creational.simplefactorymethod;

public class Water extends PETBottle {
    @Override
    public String getTaste() {
        return "這瓶水的顏色：" + color + "，香味是：" + smell;
    }
}