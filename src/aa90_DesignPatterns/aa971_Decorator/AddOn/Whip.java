package aa90_DesignPatterns.aa971_Decorator.AddOn;

import aa90_DesignPatterns.aa971_Decorator.Beverage.Beverage;

public class Whip extends AddOn
{
    public Whip(Beverage beverage)
    {
        super(beverage);
    }

    @Override
    public int getPrice() {
        return 6 + beverage.getPrice();
    }

    @Override
    public void printDescription() {
        beverage.printDescription();
        System.out.println("with Whip");
    }
}
