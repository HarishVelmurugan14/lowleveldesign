package aa90_DesignPatterns.Creational.aa94_Factory.finalVersion;

import aa90_DesignPatterns.Creational.aa94_Factory.components.button.AndroidButton;
import aa90_DesignPatterns.Creational.aa94_Factory.components.button.Button;
import aa90_DesignPatterns.Creational.aa94_Factory.components.dropdown.AndroidDropdown;
import aa90_DesignPatterns.Creational.aa94_Factory.components.dropdown.Dropdown;

public class AndroidComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
