package structural.facade;


public class ShippingSystem {
    private String drinkName;

    public ShippingSystem() {
        drinkName = "";
    }

    public void setUpChooseDrink(String drink) {
        drinkName = drink;
    }

    public void openGate() {
        System.out.println("販賣機底下出口已開啟");
    }

    public void shipping() {
        System.out.println("運作" + drinkName + "的輸送帶");
        System.out.println(drinkName + "往下掉入出口");
        System.out.println("發出撞擊聲");
        System.out.println(drinkName + "已抵達取出口");
    }

    public String getChosenDrink() {
        return drinkName;
    }
}