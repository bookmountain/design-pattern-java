package creational.builder;

public class Main {
    public static void main(String[] args) {
        ComputerFactory cf = new ComputerFactory();
        ComputerStore cs = new ComputerStore(cf);
        Computer c = cs.mixSpec();
        System.out.println(c.toString());

    }
}