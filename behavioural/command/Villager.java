package behavioural.command;

public class Villager {
    private int healthPoints;
    private final Headquarters headquarters;

    public Villager(Headquarters headquarters) {
        healthPoints = 25;
        this.headquarters = headquarters;
    }

    public void gotDamage(int damagePoints) {
        healthPoints -= damagePoints;

        if (healthPoints < 0) {
            headquarters.removeVillager();
        }
    }
}