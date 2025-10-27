package aa90_DesignPatterns.Decorator.AddOn;

import aa90_DesignPatterns.Decorator.Beverage.Beverage;

public class ChocoChip extends AddOn
{
    public ChocoChip(Beverage beverage)
    {
        super(beverage);
    }

    @Override
    public int getPrice() {
        return 8 + beverage.getPrice();
    }

    @Override
    public void printDescription() {
        beverage.printDescription();
        System.out.println("with Choco Chip");
    }
}
