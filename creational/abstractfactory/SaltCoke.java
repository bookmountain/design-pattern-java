package creational.abstractfactory;

public class SaltCoke extends Coke {
    public SaltCoke() {
        super("鹹鹹的");
    }

    @Override
    public String getTaste() {
        return "這瓶加鹽可樂的顏色：" + color + "，香味是：" + smell;
    }
}