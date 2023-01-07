package structural.flyweight;

import java.util.HashMap;

public class TreeTypeFactory {
    private static HashMap<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String leafColor, String trunkColor) {
        TreeType result = treeTypes.get(name);

        if (result == null) {
            result = new TreeType(name, leafColor, trunkColor);
            treeTypes.put(name, result);
        }

        return result;
    }

    public static int getTreeTypesCounts() {
        return treeTypes.size();
    }
}
