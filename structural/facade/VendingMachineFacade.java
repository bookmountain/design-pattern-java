package structural.facade;

import java.io.IOException;

public class VendingMachineFacade {
    private DrinksVendingMachine dvm;
    private MoneySystem ms;
    private ShippingSystem ss;

    public VendingMachineFacade() {
        dvm = new DrinksVendingMachine();
        ms = new MoneySystem();
        ss = new ShippingSystem();
    }

    public void useIt() throws IOException {
        dvm.welcome();
        ms.insertCoin(dvm.getCoin());
        dvm.displayMoney(ms.showCurrentMoney());
        ss.setUpChooseDrink(dvm.chooseDrink());
        ss.shipping();
        dvm.takeDrink(ss.getChosenDrink());
    }
}