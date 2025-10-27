package aa90_DesignPatterns.Factory;

public abstract class Platform
{
    public void setRefresh()
    {
        System.out.println("Platform set refresh");
    }

    public abstract UIComponentFactory getUIComponentFactory();
}
