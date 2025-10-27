package aa90_DesignPatterns.Factory;

public class IOS extends Platform
{
    @Override
    public UIComponentFactory getUIComponentFactory() {
        return new IOSComponentFactory();
    }
}
