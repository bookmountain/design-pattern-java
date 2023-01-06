package creational.singleton;

public class Main extends Thread {
    String phoneNumber;

    public Main(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void run() {
        EmergencyTelephone emergencyTelephone = EmergencyTelephone.getInstance();
        if (emergencyTelephone != null) {
            System.out.println("這通電話號碼是：" + phoneNumber + "，這台電話的生產序號是：" + emergencyTelephone.hashCode());
            emergencyTelephone.execute(phoneNumber);
        }
    }

    public static void main(String[] args) {
        EmergencyTelephone emergencyTelephone1 = EmergencyTelephone.getInstance();
        EmergencyTelephone emergencyTelephone2 = EmergencyTelephone.getInstance();

        if (emergencyTelephone1.hashCode() == emergencyTelephone2.hashCode()) {
            System.out.println("兩個是同一個物件");
        }

        Thread t1 = new Main("119");
        Thread t2 = new Main("110");
        t1.start();
        t2.start();
    }
}
