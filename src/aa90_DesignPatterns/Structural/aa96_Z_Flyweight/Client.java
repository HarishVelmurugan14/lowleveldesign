package aa90_DesignPatterns.Structural.aa96_Z_Flyweight;

public class Client {
    public static void main(String[] args) {
//        Flyweight Pattern
//        -----------------
//                Need: Reduce memory usage when you have a huge number of similar objects.
//        How it solves: Shares common, reusable data (intrinsic state) across objects so only unique data (extrinsic state) is stored separately.
//
//                Simple Business Examples:
//        1. Map Markers – Millions of markers share the same icon objects; only location differs.
//        2. Game Characters – Same avatar model reused; only position/health is different.
//        3. Document Editor – Same font/style objects shared across thousands of characters.


        BulletType sniperBullet = new BulletType("sniperBullet",0, 0, "", 0, 0);
        BulletType shotgunBullet = new BulletType("shotgunBullet",0, 0, "", 0, 0);
        BulletType pistolBullet = new BulletType("pistolBullet",0, 0, "", 0, 0);


        Bullet b = new Bullet(100, 199, 0, sniperBullet);
        b.fire();
        b = new Bullet(100, 199, 0, sniperBullet);
        b.fire();
        b = new Bullet(100, 199, 0, shotgunBullet);
        b.fire();
        b = new Bullet(100, 199, 0, sniperBullet);
        b.fire();
        b = new Bullet(100, 199, 0, pistolBullet);
        b.fire();

    }
}
