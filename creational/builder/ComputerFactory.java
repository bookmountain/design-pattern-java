package creational.builder;

class ComputerFactory extends ComputerBuilder{
    private String cpu;
    private String mb;
    private String hdd;
    private String vga;
    private String keyboard;
    private String mouse;
    public ComputerBuilder setCPU(String cpu){
        this.cpu = cpu;
        return this;
    }
    public ComputerBuilder setMB(String mb){
        this.mb = mb;
        return this;
    }
    public ComputerBuilder setHDD(String hdd){
        this.hdd = hdd;
        return this;
    }
    public ComputerBuilder setVGA(String vga){
        this.vga = vga;
        return this;
    }
    public ComputerBuilder setKeyboard(String keyboard){
        this.keyboard = keyboard;
        return this;
    }
    public ComputerBuilder setMouse(String mouse){
        this.mouse = mouse;
        return this;
    }
    public Computer build() {
        return new Computer(cpu, mb, hdd, vga, keyboard, mouse);
    }
}