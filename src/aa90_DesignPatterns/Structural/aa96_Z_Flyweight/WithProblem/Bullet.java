package aa90_DesignPatterns.Structural.aa96_Z_Flyweight.WithProblem;

public class Bullet {
    // Intrinsic Variables : Remains almost static and changes very rarely
    int name;
    int length;
    int breadth;
    String color;
    int damage;
    int accuracy;
    int radius;
    // Extrinsic Variables : Remains dynamic and changes very often
    int initialCoordinate;
    int finalCoordinate;
    int speed;

    public Bullet(int name, int length, int breadth, String color, int damage, int accuracy, int radius,  int initialCoordinate, int finalCoordinate, int speed) {
        this.name = name;
        this.length = length;
        this.breadth = breadth;
        this.color = color;
        this.damage = damage;
        this.accuracy = accuracy;
        this.radius = radius;

        this.initialCoordinate = initialCoordinate;
        this.finalCoordinate = finalCoordinate;
        this.speed = speed;
    }
}
