package aa90_DesignPatterns.aa94_Factory.myVersion;

import aa90_DesignPatterns.aa94_Factory.finalVersion.Android;
import aa90_DesignPatterns.aa94_Factory.finalVersion.IOS;
import aa90_DesignPatterns.aa94_Factory.finalVersion.Platform;
import aa90_DesignPatterns.aa94_Factory.components.button.AndroidButton;
import aa90_DesignPatterns.aa94_Factory.components.button.Button;
import aa90_DesignPatterns.aa94_Factory.components.button.IOSButton;
import aa90_DesignPatterns.aa94_Factory.components.dropdown.AndroidDropdown;
import aa90_DesignPatterns.aa94_Factory.components.dropdown.Dropdown;
import aa90_DesignPatterns.aa94_Factory.components.dropdown.IOSDropdown;
import aa90_DesignPatterns.aa94_Factory.myVersion.simpleFactory.PlatformFactory;


public class Client {
    public static void main(String[] args) {
        problemFaced();
        simpleFactory();
        factoryMethod();
    }

    private static void problemFaced() {
        Platform platform = new Android();
        Button button;
        Dropdown dropdown;

        if (platform instanceof Android) {
            button = new AndroidButton();
            dropdown = new AndroidDropdown();
        } else if (platform instanceof IOS) {
            button = new IOSButton();
            dropdown = new IOSDropdown();
        } else {
            throw new RuntimeException("Wrong platform type");
        }

        button.click();
        dropdown.showOptions();
    }

    private static void simpleFactory() {
        Platform platform = new IOS();
        Button button = PlatformFactory.createButton(platform);
        Dropdown dropdown = PlatformFactory.createDropdown(platform);
        button.click();
        dropdown.showOptions();
    }

    private static void factoryMethod() {
        aa90_DesignPatterns.aa94_Factory.myVersion.factoryMethod.Platform p = new aa90_DesignPatterns.aa94_Factory.myVersion.factoryMethod.Android();
        Button  button = p.createButton();
        Dropdown  dropdown = p.createDropdown();

        button.click();
        dropdown.showOptions();
    }


}
