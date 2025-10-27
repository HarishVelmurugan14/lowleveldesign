package aa90_DesignPatterns.Decorator.AddOn;

import aa90_DesignPatterns.Decorator.Beverage.Beverage;

public abstract class AddOn extends Beverage
{
    protected Beverage beverage;
    public AddOn(Beverage beverage)
    {
        this.beverage = beverage;
    }
}
