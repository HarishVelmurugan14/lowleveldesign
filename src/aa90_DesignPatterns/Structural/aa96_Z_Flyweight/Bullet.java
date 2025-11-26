package aa90_DesignPatterns.Structural.aa96_Z_Flyweight;

public class Bullet {
    int initialCoordinateX;
    int initialCoordinateY;
    int angle;
    BulletType bulletType;

    public Bullet(int initialCoordinateX, int initialCoordinateY, int angle, BulletType bulletType) {
        this.initialCoordinateX = initialCoordinateX;
        this.initialCoordinateY = initialCoordinateY;
        this.angle = angle;
        this.bulletType = bulletType;
    }

    public void fire(){
        System.out.println("Fired bullet = " + bulletType.getName());
    }
}
