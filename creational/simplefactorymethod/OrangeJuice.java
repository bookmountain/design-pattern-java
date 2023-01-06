package creational.simplefactorymethod;

public class OrangeJuice extends PETBottle {
    @Override
    public String getTaste() {
        return "這瓶柳橙汁的顏色：" + color + "，香味是：" + smell;
    }
}