package aa90_DesignPatterns.Decorator.AddOn;

import aa90_DesignPatterns.Decorator.Beverage.Beverage;

public class Soy extends AddOn
{
    public Soy(Beverage beverage)
    {
        super(beverage);
    }

    @Override
    public int getPrice() {
        return 9 + beverage.getPrice();
    }

    @Override
    public void printDescription() {
        beverage.printDescription();
        System.out.println("with Soy");
    }
}
