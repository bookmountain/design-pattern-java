package creational.abstractfactory;

public abstract class OrangeJuice extends PETBottle {
    protected OrangeJuice(String smell) {
        super(smell, "橘色");
    }

    @Override
    public String getTaste() {
        return "這瓶柳橙汁的顏色：" + color + "，香味是：" + smell;
    }
}