package aa90_DesignPatterns.Structural.aa96_Z_Flyweight;

public class BulletType {
    private String name;
    private int length;
    private int breadth;
    private String color;
    private int damage;
    private int accuracy;

    public BulletType(String name, int length, int breadth, String color, int damage, int accuracy) {
        this.name = name;
        this.length = length;
        this.breadth = breadth;
        this.color = color;
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public String getName() {
        return name;
    }
}
