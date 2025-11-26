package aa90_DesignPatterns.Structural.aa96_Decorator.AddOn;

import aa90_DesignPatterns.Structural.aa96_Decorator.Beverage.Beverage;

public abstract class AddOn extends Beverage
{
    protected Beverage beverage;
    public AddOn(Beverage beverage)
    {
        this.beverage = beverage;
    }
}
