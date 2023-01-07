package structural.adaptor;

public abstract class Car {
    protected String name;

    protected Car(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println("發動車子，名稱是：" + name);
    }

    public void turnOff() {
        System.out.println("車子熄火");
    }

    public abstract void turnRight();

    public abstract void turnLeft();

    public void speedUp() {
        System.out.println("腳踩油門");
    }

    public void brake() {
        System.out.println("腳踩煞車");
    }
}
