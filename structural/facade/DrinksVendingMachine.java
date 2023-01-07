package structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrinksVendingMachine {
    private boolean isNormal;

    public DrinksVendingMachine() {
        isNormal = true;
    }

    public void welcome() {
        if (isNormal) {
            System.out.println("歡迎使用本機器");
            System.out.println("請投入硬幣或紙鈔");
        } else {
            System.out.println("機器故障，請聯絡廠商");
        }
    }

    public int getCoin() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    public void displayMoney(int money) {
        System.out.println("已投入 " + money + " 元");
        System.out.println("系統亮起可購買飲料");
    }

    public String chooseDrink() throws IOException {
        System.out.println("請選擇飲料");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public void takeDrink(String drink) {
        System.out.println("客戶已經取出" + drink);
    }

    public void getError() {
        isNormal = false;
    }
}

