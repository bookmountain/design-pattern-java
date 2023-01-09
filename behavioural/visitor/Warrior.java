package behavioural.visitor;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, "Warrior", 30, 0, 1);
    }

    @Override
    public void showCharacterInformation() {
        System.out.println("The class is " + job + ", and the name is " + name);
        System.out.println("The hp is " + hp + ", the mp is: " + mp + "and the level is " + level);
        System.out.println("'I see, I come, I conquer' by Julius Caesar\n");
    }

    @Override
    public void accept(Action visitor) {
        visitor.executeWarriorAction(this);
    }

    @Override
    public void levelUp() {
        this.hp += 3;
        this.level += 1;
    }
}