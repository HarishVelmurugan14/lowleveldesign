package aa90_DesignPatterns.Factory;

import aa90_DesignPatterns.Factory.components.button.Button;
import aa90_DesignPatterns.Factory.components.dropdown.Dropdown;

public interface UIComponentFactory
{
    Button createButton();
    Dropdown createDropdown();
//    Menu createMenu();
//    Calendar createCalendar();
}
