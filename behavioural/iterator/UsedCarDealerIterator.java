package behavioural.iterator;

import java.util.Calendar;

public class UsedCarDealerIterator implements CarIterator {
    private final UsedCarDealer usedCarDealer;
    private int currentIndex = 0;

    public UsedCarDealerIterator(UsedCarDealer usedCarDealer) {
        this.usedCarDealer = usedCarDealer;
    }

    @Override
    public Car getFirst() {
        return usedCarDealer.getCar(0);
    }

    @Override
    public Car getCurrent() {
        if (currentIndex < usedCarDealer.size()) {
            return usedCarDealer.getCar(currentIndex);
        } else {
            return null;
        }
    }

    @Override
    public Car getNext() {
        currentIndex++;

        if (currentIndex < usedCarDealer.size()) {
            return usedCarDealer.getCar(currentIndex);
        } else {
            return null;
        }
    }

    @Override
    public boolean isDone() {
        return currentIndex < usedCarDealer.size();
    }

    @Override
    public void reset() {
        currentIndex = 0;
    }

    public void showCurrentDetails() {
        Car currentCar = getCurrent();
        System.out.println("車輛的型號是 " + currentCar.getName() + " ，製造商則是 " + currentCar.getManufacturer());
        Calendar calendar = Calendar.getInstance();

        if ((calendar.get(Calendar.YEAR) - currentCar.getProductionYear()) > 10) {
            System.out.println("注意，車齡大於 10 年");
        }

        if (currentCar.getGasolinePercent() > 50) {
            System.out.println("油量足夠\n");
        } else {
            System.out.println("油量不足，該加油了\n");
        }
    }
}
