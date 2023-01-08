package behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class UsedCarDealer implements UsedCarDealerAggregate {
    private final List<Car> list;

    public UsedCarDealer() {
        this.list = new ArrayList<>();
    }

    @Override
    public CarIterator createCarIterator() {
        return new UsedCarDealerIterator(this);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Car getCar(int index) {
        return list.get(index);
    }

    @Override
    public void add(Car car) {
        list.add(car);
    }
}
