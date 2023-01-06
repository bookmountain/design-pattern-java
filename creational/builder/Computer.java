package creational.builder;

class Computer {
    private final String cpu;
    private final String mb;
    private final String hdd;
    private final String vga;
    private final String keyboard;
    private final String mouse;

    public Computer(String cpu, String mb, String hdd, String vga, String keyboard, String mouse) {
        this.cpu = cpu;
        this.mb = mb;
        this.hdd = hdd;
        this.vga = vga;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
    @Override
    public String toString() {
        return "Computer : " + "\n" +
                "cpu : " + this.cpu + "\n" +
                "mb : " + this.mb + "\n" +
                "hdd : " + this.hdd + "\n" +
                "vga : " + this.vga +"\n" +
                "keyboard : "+ this.keyboard +"\n" +
                "mouse : "+ this.mouse;
    }
}
