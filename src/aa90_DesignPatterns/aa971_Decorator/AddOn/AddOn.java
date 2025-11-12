package aa90_DesignPatterns.aa971_Decorator.AddOn;

import aa90_DesignPatterns.aa971_Decorator.Beverage.Beverage;

public abstract class AddOn extends Beverage
{
    protected Beverage beverage;
    public AddOn(Beverage beverage)
    {
        this.beverage = beverage;
    }
}
