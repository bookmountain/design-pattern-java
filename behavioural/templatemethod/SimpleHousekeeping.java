package behavioural.templatemethod;

public class SimpleHousekeeping extends Housekeeping {
    public SimpleHousekeeping() {
        super("簡單的打掃方式");
    }

    @Override
    protected String washDetails() {
        System.out.println("手洗衣服");

        for (int i = 0; i < 10; i++) {
            System.out.println("手洗中" + ".".repeat(i));
        }

        return "一堆乾淨的衣服，花了兩小時";
    }

    @Override
    protected String cleanUpDetails() {
        System.out.println("用掃把打掃");

        for (int i = 0; i < 8; i++) {
            System.out.println("打掃中" + ".".repeat(i));
        }

        return "乾淨的房間，腰痠背痛";
    }

}
