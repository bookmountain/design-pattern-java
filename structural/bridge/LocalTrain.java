package structural.bridge;

public class LocalTrain implements Train {
    protected String name;
    protected boolean onTime;
    protected int delayMins;
    protected boolean toiletInUsing;
    protected boolean hasTrolleyService;

    public LocalTrain() {
        this.name = "區間車";
        this.onTime = true;
        this.delayMins = 0;
        this.toiletInUsing = false;
        this.hasTrolleyService = false;
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
        System.out.println("抵達目的地");
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
        System.out.println("難過，沒有東西可買");

    }

    @Override
    public void timeNeedToArrive() {
        System.out.println("還需要 " + delayMins + "分鐘才能抵達");
    }

    @Override
    public void getEmergencies() {
        // 1 - 5
        int option = (int) (Math.random() * (6 - 1 + 1)) + 1;

        switch (option) {
            case 1:
                System.out.println("撞倒擅闖平交道的車");
                setTime(-50);
                stop();
                moveOn();
                timeNeedToArrive();
                goToDestination();
                break;
            case 2:
                System.out.println("肚子有點餓，想買東西");
                getFoodByTrolleyService();
                setTime(11);
                timeNeedToArrive();
                goToDestination();
                break;
            case 3:
                System.out.println("想上廁所但有人");
                setToiletStatus(true);
                getToiletStatus();
                setTime(-1);
                timeNeedToArrive();
                goToDestination();
                break;
            case 4:
                System.out.println("想上廁所");
                setToiletStatus(false);
                getToiletStatus();
                setTime(-7);
                timeNeedToArrive();
                goToDestination();
                break;
            case 5:
                System.out.println("一路順暢");
                timeNeedToArrive();
                goToDestination();
                break;
            case 6:
                System.out.println("座位沒了，只好站著");
                setTime(-12);
                timeNeedToArrive();
                goToDestination();
                break;
        }
    }
}
