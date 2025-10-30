package aa90_DesignPatterns.aa94_Factory.finalVersion;

import aa90_DesignPatterns.aa94_Factory.components.button.Button;
import aa90_DesignPatterns.aa94_Factory.components.button.IOSButton;
import aa90_DesignPatterns.aa94_Factory.components.dropdown.Dropdown;
import aa90_DesignPatterns.aa94_Factory.components.dropdown.IOSDropdown;

public class IOSComponentFactory implements UIComponentFactory
{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
