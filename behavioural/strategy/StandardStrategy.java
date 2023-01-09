package behavioural.strategy;

import java.util.List;

public class StandardStrategy implements Strategy {
    @Override
    public int calculateFees(List<Person> people) {
        int totalFees = 0;

        for (Person person : people) {
            if (person.isHasStudentID()) {
                totalFees += 30;
            } else {
                totalFees += 60;
            }
        }

        return totalFees;
    }
}