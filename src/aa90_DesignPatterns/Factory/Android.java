package aa90_DesignPatterns.Factory;

public class Android extends Platform
{
    @Override
    public UIComponentFactory getUIComponentFactory() {
        return new AndroidComponentFactory();
    }
}
