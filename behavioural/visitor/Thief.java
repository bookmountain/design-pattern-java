package behavioural.visitor;

public class Thief extends Character {
    public Thief(String name) {
        super(name, "Thief", 35, 0, 1);
    }

    @Override
    public void showCharacterInformation() {
        System.out.println("The class is " + job + ", and the name is " + name);
        System.out.println("The hp is " + hp + ", the mp is: " + mp + "and the level is " + level);
        System.out.println("'Everything is permitted, Nothing is true.' by Assassin's Creed\n");
    }

    @Override
    public void accept(Action visitor) {
        visitor.executeThiefAction(this);
    }

    @Override
    public void levelUp() {
        this.hp += 2;
        this.level += 1;
    }
}