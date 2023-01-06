package creational.abstractfactory;

public class CherryFlavorFactory implements BeverageFactory {
    @Override
    public Coke produceCoke() {
        return new CherryCoke();
    }

    @Override
    public Water produceWater() {
        return new CherryWater();
    }

    @Override
    public OrangeJuice produceOrangeJuice() {
        return new CherryOrangeJuice();
    }
}
