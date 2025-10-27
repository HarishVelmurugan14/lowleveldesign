package aa90_DesignPatterns.Factory;

import aa90_DesignPatterns.Factory.components.button.Button;
import aa90_DesignPatterns.Factory.components.button.IOSButton;
import aa90_DesignPatterns.Factory.components.dropdown.Dropdown;
import aa90_DesignPatterns.Factory.components.dropdown.IOSDropdown;

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
