package aa90_DesignPatterns.aa94_Factory.myVersion.factoryMethod;


import aa90_DesignPatterns.aa94_Factory.components.button.AndroidButton;
import aa90_DesignPatterns.aa94_Factory.components.button.Button;
import aa90_DesignPatterns.aa94_Factory.components.dropdown.AndroidDropdown;
import aa90_DesignPatterns.aa94_Factory.components.dropdown.Dropdown;

public class Android extends Platform
{

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
