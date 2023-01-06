package creational.abstractfactory;

public class LemonCoke extends Coke {
    public LemonCoke() {
        super("清新的酸味");
    }

    @Override
    public String getTaste() {
        return "這瓶檸檬可樂的顏色：" + color + "，香味是：" + smell;
    }
}