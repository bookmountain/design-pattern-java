package behavioural.command;

import java.util.ArrayList;

public class Headquarters {
    private int woodCounts;
    private int foodCounts;
    private int goldCounts;
    private int stoneCounts;
    private final ArrayList<Villager> villagerList = new ArrayList<>();
    private final ArrayList<Paladin> paladinList = new ArrayList<>();
    private final ArrayList<House> houseList = new ArrayList<>();
    private final ArrayList<Castle> castleList = new ArrayList<>();

    public Headquarters() {
        woodCounts = 100;
        foodCounts = 100;
        goldCounts = 50;
        stoneCounts = 50;
    }

    public void createVillager() {
        if (foodCounts < 50) {
            System.out.println("食物不足，無法生產村民\n");
        } else {
            System.out.println("食物充足，已生產村民\n");
            villagerList.add(new Villager(this));
            foodCounts -= 50;
        }
    }

    public void removeVillager() {
        if (villagerList.isEmpty()) {
            System.out.println("沒有村民可以刪除");
        } else {
            villagerList.remove(0);
            System.out.println("村民已刪除");
        }
    }

    public void createPaladin() {
        if (foodCounts < 60) {
            System.out.println("食物不足，無法生產遊俠\n");
        } else if (goldCounts < 75) {
            System.out.println("黃金不足，無法生產遊俠\n");
        } else {
            System.out.println("食物充足，已生產遊俠\n");
            paladinList.add(new Paladin(this));
            foodCounts -= 60;
            goldCounts -= 75;
        }
    }

    public void removePaladin() {
        if (paladinList.isEmpty()) {
            System.out.println("沒有遊俠可以刪除");
        } else {
            paladinList.remove(0);
            System.out.println("遊俠已刪除");
        }
    }

    public void createHouse() {
        if (woodCounts < 25) {
            System.out.println("木頭不足，無法建造居住房舍\n");
        } else {
            System.out.println("木頭充足，已建造居住房舍\n");
            houseList.add(new House(this));
            woodCounts -= 25;
        }
    }

    public void removeHouse() {
        if (houseList.isEmpty()) {
            System.out.println("沒有居住房舍可以刪除");
        } else {
            houseList.remove(0);
            System.out.println("居住房舍已刪除");
        }
    }

    public void createCastle() {
        if (stoneCounts < 650) {
            System.out.println("石頭不足，無法建造城堡\n");
        } else {
            System.out.println("石頭充足，已建造城堡\n");
            castleList.add(new Castle(this));
            stoneCounts -= 600;
        }
    }

    public void removeCastle() {
        if (castleList.isEmpty()) {
            System.out.println("沒有城堡可以刪除");
        } else {
            castleList.remove(0);
            System.out.println("城堡已刪除");
        }
    }

    public void gatherWood() {
        if (villagerList.isEmpty()) {
            System.out.println("沒有村民可用\n");
        } else {
            System.out.println("村民數量足夠，開始砍樹\n");
            woodCounts += 100;
        }
    }

    public void gatherFood() {
        if (villagerList.isEmpty()) {
            System.out.println("沒有村民可用\n");
        } else {
            System.out.println("村民數量足夠，開始採集食物\n");
            foodCounts += 100;
        }
    }

    public void gatherGold() {
        if (villagerList.isEmpty()) {
            System.out.println("沒有村民可用\n");
        } else {
            System.out.println("村民數量足夠，開始挖金礦\n");
            goldCounts += 100;
        }
    }

    public void gatherStone() {
        if (villagerList.isEmpty()) {
            System.out.println("沒有村民可用\n");
        } else {
            System.out.println("村民數量足夠，開始挖石礦\n");
            stoneCounts += 100;
        }
    }

    public void showResources() {
        System.out.println("---當前資源---");
        System.out.println("木頭： " + woodCounts);
        System.out.println("食物： " + foodCounts);
        System.out.println("黃金： " + goldCounts);
        System.out.println("石頭： " + stoneCounts);
        System.out.println("---當前建築數量---");
        System.out.println("居住房舍： " + houseList.size());
        System.out.println("城堡： " + castleList.size());
        System.out.println("---當前單位數量---");
        System.out.println("村民： " + villagerList.size());
        System.out.println("遊俠： " + paladinList.size());
        System.out.println("---完畢---\n");
    }
}
