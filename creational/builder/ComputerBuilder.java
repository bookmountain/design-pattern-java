package creational.builder;

abstract class ComputerBuilder {
    protected Computer computer;

    public abstract ComputerBuilder setCPU(String cpu);
    public abstract ComputerBuilder setMB(String mb);
    public abstract ComputerBuilder setHDD(String hdd);
    public abstract ComputerBuilder setVGA(String vga);
    public abstract ComputerBuilder setKeyboard(String keyboard);
    public abstract ComputerBuilder setMouse(String mouse);
    public abstract Computer build();
}