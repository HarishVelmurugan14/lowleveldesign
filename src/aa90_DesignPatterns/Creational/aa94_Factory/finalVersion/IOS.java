package aa90_DesignPatterns.Creational.aa94_Factory.finalVersion;

public class IOS extends Platform
{
    @Override
    public UIComponentFactory getUIComponentFactory() {
        return new IOSComponentFactory();
    }
}
