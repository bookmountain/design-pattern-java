package structural.composite;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcreteMilitaryUnit extends MilitaryUnit {
    private ArrayList<MilitaryUnit> militaryUnits = new ArrayList<MilitaryUnit>();

    public ConcreteMilitaryUnit(String name) {
        super(name, 0, 0);
    }

    @Override
    public void add(MilitaryUnit unit) {
        militaryUnits.add(unit);
    }

    @Override
    public void remove(MilitaryUnit unit) {
        militaryUnits.remove(unit);
    }

    @Override
    public void display(int depth) {
        char[] title = new char[depth];
        Arrays.fill(title, '-');
        System.out.println(new String(title) + name);

        for (MilitaryUnit unit : militaryUnits) {
            unit.display(depth + 2);
        }
    }

    @Override
    public int reportUnitCounts() {
        for (MilitaryUnit militaryUnit : militaryUnits) {
            unitCounts += militaryUnit.reportUnitCounts();
        }

        return unitCounts;
    }

    @Override
    public int reportWeaponCounts() {
        for (MilitaryUnit militaryUnit : militaryUnits) {
            weaponCounts += militaryUnit.reportWeaponCounts();
        }

        return weaponCounts;
    }
}