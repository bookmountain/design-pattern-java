package structural.facade;

public class MoneySystem {
    private int currentMoney;

    public MoneySystem() {
        currentMoney = 0;
    }

    public void insertCoin(int value) {
        currentMoney += value;
    }

    public int showCurrentMoney() {
        return currentMoney;
    }
}
