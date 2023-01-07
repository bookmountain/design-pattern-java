package structural.adaptor;

public class RightHandInLeftHandTraffic extends RightHandCar {
    public RightHandInLeftHandTraffic(String name) {
        super(name);
    }

    @Override
    public void turnRight() {
        System.out.println("打右轉燈");
        System.out.println("車輛靠右");
        System.out.println("確認沒有行人");
        System.out.println("確認沒有機車");
        System.out.println("車輛右轉");
    }

    @Override
    public void turnLeft() {
        System.out.println("打左轉燈");
        System.out.println("車輛向左靠近分隔島");
        System.out.println("車輛向前靠近左轉區塊");
        System.out.println("等待左轉燈亮起");
        System.out.println("左轉燈亮起");
        System.out.println("車輛左轉");
    }
}