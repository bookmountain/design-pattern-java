package behavioural.command;

public class House {
    private int healthPoints;
    private final Headquarters headquarters;

    public House(Headquarters headquarters) {
        healthPoints = 550;
        this.headquarters = headquarters;
    }

    public void gotDamage(int damagePoints) {
        healthPoints -= damagePoints;

        if (healthPoints < 0) {
            headquarters.removeHouse();
        }
    }
}

