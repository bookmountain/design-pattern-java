package behavioural.command;

public class Paladin {
    private int healthPoints;
    private final Headquarters headquarters;

    public Paladin(Headquarters headquarters) {
        healthPoints = 160;
        this.headquarters = headquarters;
    }

    public void gotDamage(int damagePoints) {
        healthPoints -= damagePoints;

        if (healthPoints < 0) {
            headquarters.removePaladin();
        }
    }
}
