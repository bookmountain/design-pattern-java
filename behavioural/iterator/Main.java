package behavioural.iterator;

public class Main {
    public static void main(String[] args) {
        UsedCarDealer sellingCars = new UsedCarDealer();
        sellingCars.add(new Car("RX450h", "Lexus", 2020, 100));
        sellingCars.add(new Car("M3", "BMW", 2015, 90));
        sellingCars.add(new Car("Camaro 2SS", "Chevrolet", 2017, 50));
        sellingCars.add(new Car("Continental Flying Spur", "Bentley", 2008, 10));
        sellingCars.add(new Car("Mustang", "Ford", 2020, 10));
        sellingCars.add(new Car("MGB", "MG", 1979, 5));
        sellingCars.add(new Car("Porsche", "Cayman S", 2014, 20));
        sellingCars.add(new Car("S60 T5", "Volvo", 2020, 15));
        sellingCars.add(new Car("Grand Cherokee Overland", "Jeep", 2017, 58));

        UsedCarDealerIterator carIterator = new UsedCarDealerIterator(sellingCars);
        while (carIterator.isDone()) {
            carIterator.showCurrentDetails();
            carIterator.getNext();
        }
    }
}
