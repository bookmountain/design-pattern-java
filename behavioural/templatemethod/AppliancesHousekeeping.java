package behavioural.templatemethod;

public class AppliancesHousekeeping extends Housekeeping {
    public AppliancesHousekeeping() {
        super("家電幫忙下的打掃方式");
    }

    @Override
    protected String washDetails() {
        System.out.println("洗衣機洗衣服");

        for (int i = 0; i < 5; i++) {
            System.out.println("嘟".repeat(i));
        }

        return "一堆乾淨的衣服，花了一小時";
    }

    @Override
    protected String cleanUpDetails() {
        System.out.println("用吸塵器打掃");

        for (int i = 0; i < 3; i++) {
            System.out.println("嗚".repeat(i));
        }

        return "乾淨的房間，輕鬆完成";
    }

}
