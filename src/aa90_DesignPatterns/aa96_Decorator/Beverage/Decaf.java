package aa90_DesignPatterns.aa96_Decorator.Beverage;

public class Decaf extends Beverage {
    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public void printDescription() {
        System.out.println("Decaf");
    }
}
