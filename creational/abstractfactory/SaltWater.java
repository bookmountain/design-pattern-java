package creational.abstractfactory;

public class SaltWater extends Water {
    public SaltWater() {
        super("鹹鹹的");
    }

    @Override
    public String getTaste() {
        return "這瓶加鹽礦泉水的顏色：" + color + "，香味是：" + smell;
    }
}