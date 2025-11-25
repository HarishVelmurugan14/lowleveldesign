package aa90_DesignPatterns.Creational.aa94_Factory.finalVersion;

import aa90_DesignPatterns.Creational.aa94_Factory.components.button.Button;
import aa90_DesignPatterns.Creational.aa94_Factory.components.dropdown.Dropdown;

public interface UIComponentFactory
{
    Button createButton();
    Dropdown createDropdown();
//    Menu createMenu();
//    Calendar createCalendar();
}
