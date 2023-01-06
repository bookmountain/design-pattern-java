package creational.builder;

public class BeverageDirector {
    private BeverageBuilder beverageBuilder;

    public void setBeverageBuilder(BeverageBuilder beverageBuilder) {
        this.beverageBuilder = beverageBuilder;
    }

    public void produceBeverage() {
        beverageBuilder
            .buildStart()
            .getPreform()
            .heatPreform()
            .moldingForm()
            .cleanForm()
            .dryForm()
            .fillBeverage()
            .putOnBottleCap()
            .putOnLabel()
            .shrinkLabel()
            .buildFinish();
    }
}
