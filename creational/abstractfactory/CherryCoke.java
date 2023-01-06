package creational.abstractfactory;

public class CherryCoke extends Coke {
    public CherryCoke() {
        super("櫻桃味道");
    }

    @Override
    public String getTaste() {
        return "這瓶櫻桃可樂的顏色：" + color + "，香味是：" + smell;
    }
}