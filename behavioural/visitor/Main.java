package behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("建立角色");
        List<Character> characters = new ArrayList<>();
        characters.add(new Warrior("Zest"));
        characters.add(new Thief("Sauber"));
        characters.add(new BlackMage("Fritz"));

        System.out.println("\n集體攻擊");
        for (Character character : characters) {
            character.accept(new Attack());
        }

        System.out.println("\n集體防禦");
        for (Character character : characters) {
            character.accept(new Defense());
        }

        System.out.println("\n集體使用魔法");
        for (Character character : characters) {
            character.accept(new Magic());
        }

        System.out.println("\n集體逃跑");
        for (Character character : characters) {
            character.accept(new Run());
        }
    }
}