package creational.abstractfactory;

public class SaltFlavorFactory implements BeverageFactory {
    @Override
    public Coke produceCoke() {
        return new SaltCoke();
    }

    @Override
    public Water produceWater() {
        return new SaltWater();
    }

    @Override
    public OrangeJuice produceOrangeJuice() {
        return new SaltOrangeJuice();
    }
}
