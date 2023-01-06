package creational.abstractfactory;

public interface BeverageFactory {
    Coke produceCoke();

    Water produceWater();

    OrangeJuice produceOrangeJuice();
}
