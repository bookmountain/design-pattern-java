package creational.builder;

public class WaterBuilder extends BeverageBuilder {
    @Override
    public BeverageBuilder buildStart() {
        System.out.println("工廠即將生產礦泉水");
        return this;
    }

    @Override
    public BeverageBuilder getPreform() {
        System.out.println("取得瓶胚");
        System.out.println("送入輸送帶");
        return this;
    }

    @Override
    public BeverageBuilder heatPreform() {
        System.out.println("加熱軟化瓶胚");
        return this;
    }

    @Override
    public BeverageBuilder moldingForm() {
        System.out.println("送入吹瓶機");
        System.out.println("吹出成型");
        return this;
    }

    @Override
    public BeverageBuilder cleanForm() {
        System.out.println("送入無菌室");
        System.out.println("清洗瓶身內外");
        System.out.println("消毒瓶身內外");
        return this;
    }

    @Override
    public BeverageBuilder dryForm() {
        System.out.println("吹乾瓶身");
        return this;
    }

    @Override
    public BeverageBuilder fillBeverage() {
        System.out.println("飲料裝填：礦泉水");
        return this;
    }

    @Override
    public BeverageBuilder putOnBottleCap() {
        System.out.println("封瓶蓋：白色瓶蓋");
        System.out.println("離開無菌室");
        return this;
    }

    @Override
    public BeverageBuilder putOnLabel() {
        System.out.println("套上瓶身膠膜：白色膠膜");
        return this;
    }

    @Override
    public BeverageBuilder shrinkLabel() {
        System.out.println("蒸汽收縮瓶身膠膜");
        return this;
    }

    @Override
    public BeverageBuilder buildFinish() {
        System.out.println("礦泉水生產完成");
        return this;
    }
}
