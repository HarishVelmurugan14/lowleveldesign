package aa90_DesignPatterns.Creational.aa94_Factory.finalVersion;

public abstract class Platform
{
    public void setRefresh()
    {
        System.out.println("Platform set refresh");
    }

    public abstract UIComponentFactory getUIComponentFactory();
}
