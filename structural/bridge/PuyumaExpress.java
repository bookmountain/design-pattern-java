package structural.bridge;

public class PuyumaExpress implements Train {
    protected String name;
    protected boolean onTime;
    protected int delayMins;
    protected boolean toiletInUsing;
    protected boolean hasTrolleyService;

    public PuyumaExpress() {
        this.name = "普悠瑪";
        this.onTime = true;
        this.delayMins = 0;
        this.toiletInUsing = false;
        this.hasTrolleyService = true;
    }

    @Override
    public String checkName() {
        return name;
    }

    @Override
    public boolean isOnTime() {
        return onTime;
    }

    @Override
    public void setTime(int min) {
        delayMins += min;
        onTime = (delayMins < 0);
    }

    @Override
    public void goToDestination() {
        System.out.println("很快抵達目的地");
    }

    @Override
    public boolean getToiletStatus() {
        return toiletInUsing;
    }

    @Override
    public void setToiletStatus(boolean using) {
        toiletInUsing = using;
    }

    @Override
    public void moveOn() {
        System.out.println("列車向前");
    }

    @Override
    public void stop() {
        System.out.println("列車停駛");
    }

    @Override
    public void getFoodByTrolleyService() {
        if (hasTrolleyService) {
            System.out.println("服務員用推車販售食物");
        } else {
            System.out.println("難過，沒有東西可買");
        }

    }

    @Override
    public void timeNeedToArrive() {
        System.out.println("還需要 " + delayMins + "分鐘才能抵達");
    }

    @Override
    public void getEmergencies() {
        // 1 - 4
        int option = (int) (Math.random() * (4 - 1 + 1)) + 1;

        switch (option) {
            case 1:
                System.out.println("肚子有點餓，想買東西");
                getFoodByTrolleyService();
                setTime(-3);
                timeNeedToArrive();
                goToDestination();
                break;
            case 2:
                System.out.println("上下車花費太多時間");
                setTime(-15);
                moveOn();
                timeNeedToArrive();
                goToDestination();
                break;
            case 3:
                System.out.println("想上廁所");
                setToiletStatus(false);
                setTime(12);
                getToiletStatus();
                timeNeedToArrive();
                goToDestination();
                break;
            case 4:
                System.out.println("一路順暢");
                timeNeedToArrive();
                goToDestination();
                break;
        }
    }
}