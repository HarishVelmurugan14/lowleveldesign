package aa90_DesignPatterns.Factory;

import aa90_DesignPatterns.Factory.components.button.Button;
import aa90_DesignPatterns.Factory.components.dropdown.Dropdown;

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
