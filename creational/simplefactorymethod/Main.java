package creational.simplefactorymethod;

public class Main {
    public static void main(String[] args) throws Exception {
        String option = "Coke";
        String smell = "甜甜的";
        String color = "黑黑的";
        PETBottle bottle = PETBottleFactory.getPETBottle(option);
        bottle.setBottle(smell, color);
        System.out.println(bottle.getTaste());
    }
}
