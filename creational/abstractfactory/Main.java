package creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("準備開喝！");
        BeverageFactory saltFlavorFactory = new SaltFlavorFactory();
        Coke saltCoke = saltFlavorFactory.produceCoke();
        Water saltWater = saltFlavorFactory.produceWater();
        OrangeJuice saltOrangeJuice = saltFlavorFactory.produceOrangeJuice();

        System.out.println("鹽味派對！");
        System.out.println(saltCoke.getTaste());
        System.out.println(saltWater.getTaste());
        System.out.println(saltOrangeJuice.getTaste());

        System.out.println("\n口味更換");
        BeverageFactory lemonFlavorFactory = new LemonFlavorFactory();
        Coke lemonCoke = lemonFlavorFactory.produceCoke();
        Water lemonWater = lemonFlavorFactory.produceWater();
        OrangeJuice lemonOrangeJuice = lemonFlavorFactory.produceOrangeJuice();

        System.out.println("檸檬派對！");
        System.out.println(lemonCoke.getTaste());
        System.out.println(lemonWater.getTaste());
        System.out.println(lemonOrangeJuice.getTaste());

        System.out.println("\n最後一輪");
        BeverageFactory cherryFlavorFactory = new CherryFlavorFactory();
        Coke cherryCoke = cherryFlavorFactory.produceCoke();
        Water cherryWater = cherryFlavorFactory.produceWater();
        OrangeJuice cherryOrangeJuice = cherryFlavorFactory.produceOrangeJuice();

        System.out.println("櫻桃派對！");
        System.out.println(cherryCoke.getTaste());
        System.out.println(cherryWater.getTaste());
        System.out.println(cherryOrangeJuice.getTaste());
    }
}