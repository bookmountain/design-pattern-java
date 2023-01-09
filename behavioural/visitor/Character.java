package behavioural.visitor;

public abstract class Character {
    protected String name;
    protected String job;
    protected int hp;
    protected int mp;
    protected int level;

    protected Character(String name, String job, int hp, int mp, int level) {
        this.name = name;
        this.job = job;
        this.hp = hp;
        this.mp = mp;
        this.level = level;
        System.out.println("The character " + this.name + " is created successfully");
    }

    public abstract void levelUp();

    public abstract void showCharacterInformation();

    public abstract void accept(Action visitor);
}
