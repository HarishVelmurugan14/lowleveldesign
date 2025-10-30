package aa90_DesignPatterns.aa94_Factory.myVersion.simpleFactory;

import aa90_DesignPatterns.aa94_Factory.finalVersion.Android;
import aa90_DesignPatterns.aa94_Factory.finalVersion.IOS;
import aa90_DesignPatterns.aa94_Factory.finalVersion.Platform;
import aa90_DesignPatterns.aa94_Factory.components.button.AndroidButton;
import aa90_DesignPatterns.aa94_Factory.components.button.Button;
import aa90_DesignPatterns.aa94_Factory.components.button.IOSButton;
import aa90_DesignPatterns.aa94_Factory.components.dropdown.AndroidDropdown;
import aa90_DesignPatterns.aa94_Factory.components.dropdown.Dropdown;
import aa90_DesignPatterns.aa94_Factory.components.dropdown.IOSDropdown;

public class PlatformFactory {

    public static Button createButton(Platform platform) {
        if (platform instanceof Android) {
            return new AndroidButton();
        } else if (platform instanceof IOS) {
            return new IOSButton();
        } else {
            throw new RuntimeException("Wrong platform type");
        }
    }
    public static Dropdown createDropdown(Platform platform) {
        if (platform instanceof Android) {
            return new AndroidDropdown();
        } else if (platform instanceof IOS) {
            return new IOSDropdown();
        } else {
            throw new RuntimeException("Wrong platform type");
        }
    }
}
