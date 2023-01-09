package behavioural.visitor;

public class BlackMage extends Character {
    public BlackMage(String name) {
        super(name, "Black Mage", 35, 0, 1);
    }

    @Override
    public void showCharacterInformation() {
        System.out.println("The class is " + job + ", and the name is " + name);
        System.out.println("The hp is " + hp + ", the mp is: " + mp + "and the level is " + level);
        System.out.println("'Knowledge is power, but using it wisely is the key.' by Khadgar\n");
    }

    @Override
    public void accept(Action visitor) {
        visitor.executeBlackMageAction(this);
    }

    @Override
    public void levelUp() {
        this.hp += 1;
        this.mp += 3;
        this.level += 1;
    }
}