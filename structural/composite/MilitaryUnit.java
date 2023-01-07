package structural.composite;

public abstract class MilitaryUnit {
    protected String name;

    protected int unitCounts;

    protected int weaponCounts;

    protected MilitaryUnit(String name, int unitCounts, int weaponCounts) {
        this.name = name;
        this.unitCounts = unitCounts;
        this.weaponCounts = weaponCounts;
    }

    public abstract void add(MilitaryUnit unit);

    public abstract void remove(MilitaryUnit unit);

    public abstract void display(int depth);

    public abstract int reportUnitCounts();

    public abstract int reportWeaponCounts();
}
