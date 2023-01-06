package creational.abstractfactory;

public abstract class Coke extends PETBottle {
    protected Coke(String smell) {
        super(smell, "黑色");
    }

    @Override
    public String getTaste() {
        return "這瓶可樂的顏色：" + color + "，香味是：" + smell;
    }
}