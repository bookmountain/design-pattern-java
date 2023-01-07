package structural.adaptor;

public class RightHandCar extends Car {
    public RightHandCar(String name) {
        super(name);
    }

    @Override
    public void turnRight() {
        System.out.println("打右轉燈");
        System.out.println("車輛向右靠近分隔島");
        System.out.println("車輛向前靠近右轉區塊");
        System.out.println("等待右轉燈亮起");
        System.out.println("右轉燈亮起");
        System.out.println("車輛右轉");
    }

    @Override
    public void turnLeft() {
        System.out.println("打左轉燈");
        System.out.println("車輛靠左");
        System.out.println("確認沒有行人");
        System.out.println("確認沒有機車");
        System.out.println("車輛左轉");
    }
}