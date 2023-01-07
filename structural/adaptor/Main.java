package structural.adaptor;

public class Main {
    public static void main(String[] args) {
        System.out.println("---國產車上路囉---");
        Car domesticCar = new LeftHandCar("Altis");
        domesticCar.turnOn();
        domesticCar.speedUp();
        domesticCar.brake();
        domesticCar.turnRight();
        domesticCar.speedUp();
        domesticCar.brake();
        domesticCar.turnLeft();
        domesticCar.turnOff();

        System.out.println("\n---完美，下車換日本進口車---");
        Car madeInJapanCar = new RightHandInLeftHandTraffic("CT 200h");
        madeInJapanCar.turnOn();
        madeInJapanCar.speedUp();
        madeInJapanCar.brake();
        madeInJapanCar.turnRight();
        madeInJapanCar.speedUp();
        madeInJapanCar.brake();
        madeInJapanCar.turnLeft();
        madeInJapanCar.turnOff();
        System.out.println("\n---測試完成，左駕右駕都很棒---");
    }
}