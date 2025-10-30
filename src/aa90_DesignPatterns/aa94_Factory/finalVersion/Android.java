package aa90_DesignPatterns.aa94_Factory.finalVersion;

public class Android extends Platform
{
    @Override
    public UIComponentFactory getUIComponentFactory() {
        return new AndroidComponentFactory();
    }
}
