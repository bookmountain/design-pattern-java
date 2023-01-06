package creational.prototype;

public class NewTasteBeverage implements Cloneable {
    private String baseBeverage;
    private String taste;
    private String size;
    private final IdInfo idInfo;

    public NewTasteBeverage(String baseBeverage) {
        this.baseBeverage = baseBeverage;
        idInfo = new IdInfo();
    }

    /**
     * Deep Clone
     */
    private NewTasteBeverage(IdInfo idInfo) throws CloneNotSupportedException {
        this.idInfo = (IdInfo) idInfo.clone();
    }

    public void setProduceInfo(String location, String factoryAddress) {
        idInfo.setLocation(location);
        idInfo.setFactoryAddress(factoryAddress);
    }

    public void setSeriesNumber(String seriesNumber) {
        idInfo.setSeriesNumber(seriesNumber);
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        super.clone();
        NewTasteBeverage clonedObject = new NewTasteBeverage(this.idInfo);
        clonedObject.baseBeverage = this.baseBeverage;
        clonedObject.taste = this.taste;
        clonedObject.size = this.size;
        return clonedObject;
    }

    public void showInfo() {
        System.out.println("產品是：" + taste + " " + baseBeverage + " " + size);
        System.out.println("產地資訊：" + idInfo.getFactoryAddress() + " " + idInfo.getLocation());
        System.out.println("序號：" + idInfo.getSeriesNumber() + "\n");
    }
}

