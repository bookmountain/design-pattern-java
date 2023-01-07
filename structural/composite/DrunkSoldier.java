package structural.composite;

import java.util.Arrays;

public class DrunkSoldier extends MilitaryUnit {
    public DrunkSoldier(String name) {
        super(name, 1, 3);
    }

    @Override
    public void add(MilitaryUnit unit) {
    }

    @Override
    public void remove(MilitaryUnit unit) {
    }

    @Override
    public void display(int depth) {
        char[] title = new char[depth];
        Arrays.fill(title, '-');
        System.out.println(new String(title) + name);
    }

    @Override
    public int reportUnitCounts() {
        return unitCounts;
    }

    @Override
    public int reportWeaponCounts() {
        return weaponCounts;
    }
}

