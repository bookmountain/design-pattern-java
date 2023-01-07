package structural.flyweight;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static final long MEGABYTE = 1024L * 1024L;
    private static final Random random = new Random();
    private static final ArrayList<Tree> forest = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("\n建立四千棵榕樹");
        for (int i = 0; i < 4000; i++) {
            Tree tree = createTree("榕樹");
            forest.add(tree);
        }

        System.out.println("\n建立四千棵樟樹");
        for (int i = 0; i < 4000; i++) {
            Tree tree = createTree("樟樹");
            forest.add(tree);
        }

        System.out.println("\n建立四千顆台灣樂樹");
        for (int i = 0; i < 4000; i++) {
            Tree tree = createTree("台灣樂樹");
            forest.add(tree);
        }

        System.out.println("\n這片森林，擁有" + forest.size() + "顆樹木");
        System.out.println("TreeTypeFactory 有 " + TreeTypeFactory.getTreeTypesCounts() + " 顆樹種");
        calculateRAMUsage();
    }

    private static Tree createTree(String treeType) {
        // 1 - 12000
        int positionX = random.nextInt(12000 + 1) + 1;
        int positionY = random.nextInt(12000 + 1) + 1;
        Tree tree = null;

        if (treeType.equals("榕樹")) {
            tree = new Tree(positionX, positionY, TreeTypeFactory.getTreeType("榕樹", "#2D5A27", "#A56406"));
        } else if (treeType.equals("樟樹")) {
            tree = new Tree(positionX, positionY, TreeTypeFactory.getTreeType("樟樹", "#296223", "#915A08"));
        } else if (treeType.equals("台灣樂樹")) {
            tree = new Tree(positionX, positionY, TreeTypeFactory.getTreeType("台灣樂樹", "#174A11", "#492C00"));
        }

        return tree;
    }

    private static void calculateRAMUsage() {
        // 取得 Java runtime
        Runtime runtime = Runtime.getRuntime();

        // 執行 garbage collector
        runtime.gc();

        // 計算記憶體的使用
        long memory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Used memory is bytes: " + memory);
        System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
    }

    private static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
}
