package behavioural.iterator;

public class Car {
    private final String name;
    private final String manufacturer;
    private final int productionYear;
    private final int gasolinePercent;

    public Car(String name, String manufacturer, int productionYear, int gasolinePercent) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.gasolinePercent = gasolinePercent;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getGasolinePercent() {
        return gasolinePercent;
    }
}
