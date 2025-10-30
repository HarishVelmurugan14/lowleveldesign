package aa90_DesignPatterns.aa94_Factory.finalVersion;

import aa90_DesignPatterns.aa94_Factory.components.button.Button;
import aa90_DesignPatterns.aa94_Factory.components.dropdown.Dropdown;

public class Client
{
    public static void main(String[] args)
    {
        Platform p = new IOS();
        UIComponentFactory uiComponentFactory
                = p.getUIComponentFactory();

        Button button = uiComponentFactory.createButton();
        Dropdown dropdown = uiComponentFactory.createDropdown();

        button.click();
        dropdown.showOptions();
    }
}
