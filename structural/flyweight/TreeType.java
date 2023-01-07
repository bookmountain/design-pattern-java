package structural.flyweight;

public class TreeType {
    private String name;
    private String leafColor;
    private String trunkColor;

    public TreeType(String name, String leafColor, String trunkColor) {
        this.name = name;
        this.leafColor = leafColor;
        this.trunkColor = trunkColor;
    }

    public String getName() {
        return name;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public String getTrunkColor() {
        return trunkColor;
    }
}
