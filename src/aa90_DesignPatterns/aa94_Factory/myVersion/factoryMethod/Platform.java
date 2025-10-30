package aa90_DesignPatterns.aa94_Factory.myVersion.factoryMethod;

import aa90_DesignPatterns.aa94_Factory.components.button.Button;
import aa90_DesignPatterns.aa94_Factory.components.dropdown.Dropdown;

public abstract class Platform
{
    public void setRefresh()
    {
        System.out.println("Platform set refresh");
    }

    public abstract Button createButton();
    public abstract Dropdown createDropdown();
}
