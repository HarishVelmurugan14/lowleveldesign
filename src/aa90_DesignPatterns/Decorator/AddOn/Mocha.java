package aa90_DesignPatterns.Decorator.AddOn;

import aa90_DesignPatterns.Decorator.Beverage.Beverage;

public class Mocha extends AddOn
{
    public Mocha(Beverage beverage)
    {
        super(beverage);
    }

    @Override
    public int getPrice() {
        return 7 + beverage.getPrice();
    }

    @Override
    public void printDescription() {
        beverage.printDescription();
        System.out.println("with Mocha");
    }
}
