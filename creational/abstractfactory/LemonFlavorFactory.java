package creational.abstractfactory;

public class LemonFlavorFactory implements BeverageFactory {
    @Override
    public Coke produceCoke() {
        return new LemonCoke();
    }

    @Override
    public Water produceWater() {
        return new LemonWater();
    }

    @Override
    public OrangeJuice produceOrangeJuice() {
        return new LemonOrangeJuice();
    }
}