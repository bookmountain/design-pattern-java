package creational.abstractfactory;

public class SaltOrangeJuice extends OrangeJuice {
    public SaltOrangeJuice() {
        super("鹹鹹的");
    }

    @Override
    public String getTaste() {
        return "這瓶加鹽柳橙汁的顏色：" + color + "，香味是：" + smell;
    }
}
