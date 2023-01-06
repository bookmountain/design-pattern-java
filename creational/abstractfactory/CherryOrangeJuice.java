package creational.abstractfactory;

public class CherryOrangeJuice extends OrangeJuice {
    public CherryOrangeJuice() {
        super("櫻桃味道");
    }

    @Override
    public String getTaste() {
        return "這瓶櫻桃柳橙汁的顏色：" + color + "，香味是：" + smell;
    }
}
