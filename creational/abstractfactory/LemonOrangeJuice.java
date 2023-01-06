package creational.abstractfactory;

public class LemonOrangeJuice extends OrangeJuice {
    public LemonOrangeJuice() {
        super("柑橘類特有的酸味");
    }

    @Override
    public String getTaste() {
        return "這瓶檸檬柳橙汁的顏色：" + color + "，香味是：" + smell;
    }
}
