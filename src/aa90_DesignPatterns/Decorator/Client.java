package aa90_DesignPatterns.Decorator;

import aa90_DesignPatterns.Decorator.AddOn.ChocoChip;
import aa90_DesignPatterns.Decorator.AddOn.Mocha;
import aa90_DesignPatterns.Decorator.AddOn.Soy;
import aa90_DesignPatterns.Decorator.AddOn.Whip;
import aa90_DesignPatterns.Decorator.Beverage.Beverage;
import aa90_DesignPatterns.Decorator.Beverage.DarkRoast;
import aa90_DesignPatterns.Decorator.Beverage.Decaf;

public class Client
{
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage.printDescription();
        System.out.println(beverage.getPrice());

        System.out.println(" ******************* ");
        beverage = new ChocoChip(new Soy(new Whip(beverage)));
        beverage.printDescription();
        System.out.println(beverage.getPrice());

        /* Double Mocha Decaf with choco chip */
        System.out.println(" ******************************************* ");
        Beverage beverage2 = new Decaf();
        beverage2 = new Mocha(beverage2);
        beverage2 = new ChocoChip(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2.printDescription();
        System.out.println(beverage2.getPrice());

    }
}
