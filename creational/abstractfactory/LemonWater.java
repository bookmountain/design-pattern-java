package creational.abstractfactory;

public class LemonWater extends Water {
    public LemonWater() {
        super("清新的酸味");
    }

    @Override
    public String getTaste() {
        return "這瓶檸檬礦泉水的顏色：" + color + "，香味是：" + smell;
    }
}
