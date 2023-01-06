package creational.builder;

public abstract class BeverageBuilder {
    /**
     * 宣告開始生產
     */
    public abstract BeverageBuilder buildStart();

    /**
     * 取得瓶胚
     */
    public abstract BeverageBuilder getPreform();

    /**
     * 加熱瓶胚
     */
    public abstract BeverageBuilder heatPreform();

    /**
     * 瓶胚送入吹瓶機模型內吹出成型
     */
    public abstract BeverageBuilder moldingForm();

    /**
     * 清洗瓶身
     */
    public abstract BeverageBuilder cleanForm();

    /**
     * 吹乾空瓶
     */
    public abstract BeverageBuilder dryForm();

    /**
     * 飲料充填
     */
    public abstract BeverageBuilder fillBeverage();

    /**
     * 封瓶蓋
     */
    public abstract BeverageBuilder putOnBottleCap();

    /**
     * 套上膠膜
     */
    public abstract BeverageBuilder putOnLabel();

    /**
     * 收縮膠膜
     */
    public abstract BeverageBuilder shrinkLabel();

    /**
     * 宣告完成生產
     */
    public abstract BeverageBuilder buildFinish();
}