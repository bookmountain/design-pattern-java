package creational.singleton;

public class EmergencyTelephone {
    private static EmergencyTelephone instance;

    private EmergencyTelephone() {
    }

    private void useTelephone(String phoneNumber) {
        System.out.println("（號碼：" + phoneNumber + "）拿起話筒");
        System.out.println("（號碼：" + phoneNumber + "）輸入號碼");
        System.out.println("（號碼：" + phoneNumber + "）等待接通");
        System.out.println("（號碼：" + phoneNumber + "）確認電話已經打通");
    }

    private void tellDetails(String phoneNumber) {
        System.out.println("（號碼：" + phoneNumber + "）詳述情況");
        System.out.println("（號碼：" + phoneNumber + "）告知地點");
        System.out.println("（號碼：" + phoneNumber + "）記錄指示");
    }

    private void finishTelephoneTalk(String phoneNumber) {
        System.out.println("（號碼：" + phoneNumber + "）掛上電話");
        System.out.println("（號碼：" + phoneNumber + "）思考指示");
        System.out.println("（號碼：" + phoneNumber + "）行動");
    }

    public synchronized void execute(String phoneNumber) {
        useTelephone(phoneNumber);
        tellDetails(phoneNumber);
        finishTelephoneTalk(phoneNumber);
    }

    public static EmergencyTelephone getInstance() {
        if (instance == null) {
            synchronized (EmergencyTelephone.class) {
                if (instance == null) {
                    instance = new EmergencyTelephone();
                }
            }
        }

        return instance;

    }
}