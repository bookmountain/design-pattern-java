package behavioural.strategy;

import java.util.ArrayList;
import java.util.List;

public class ZoomTicketVendingMachine {
    private Strategy strategy;
    private List<Person> people;

    public ZoomTicketVendingMachine() {
        people = new ArrayList<>();
    }

    public void setStrategy(int peopleCounts) {
        if (peopleCounts >= 30) {
            strategy = new GroupDiscountStrategy();
        } else {
            strategy = new StandardStrategy();
        }
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public int calculateFees() {
        setStrategy(people.size());
        return strategy.calculateFees(people);
    }

    public void clear() {
        people.clear();
    }
}
