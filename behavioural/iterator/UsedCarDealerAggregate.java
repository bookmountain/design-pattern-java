package behavioural.iterator;

public interface UsedCarDealerAggregate {
    CarIterator createCarIterator();

    int size();

    Car getCar(int index);

    void add(Car car);
}
