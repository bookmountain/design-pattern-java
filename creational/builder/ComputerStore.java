package creational.builder;

class ComputerStore {

    private final ComputerBuilder computerBuilder;

    ComputerStore(ComputerBuilder computerBuilder){

        this.computerBuilder = computerBuilder;
    }
    public Computer mixSpec(){
        return computerBuilder
                .setCPU("intel")
                .setMB("Apple")
                .setHDD("acer")
                .setVGA("msi")
                .build();
    }
    public Computer appleSpec(){
        return computerBuilder
                .setCPU("Apple")
                .setMB("Apple")
                .setHDD("Apple")
                .setVGA("Apple")
                .build();
    }
}