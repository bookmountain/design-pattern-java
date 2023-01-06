package creational.abstractfactory;

public abstract class Water extends PETBottle {
    protected Water(String smell) {
        super(smell, "透明");
    }

    @Override
    public String getTaste() {
        return "這瓶水的顏色：" + color + "，香味是：" + smell;
    }
}