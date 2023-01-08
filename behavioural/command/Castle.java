package behavioural.command;

public class Castle {
    private int healthPoints;
    private final Headquarters headquarters;

    public Castle(Headquarters headquarters) {
        healthPoints = 4800;
        this.headquarters = headquarters;
    }

    public void gotDamage(int damagePoints) {
        healthPoints -= damagePoints;

        if (healthPoints < 0) {
            headquarters.removeCastle();
        }
    }
}
