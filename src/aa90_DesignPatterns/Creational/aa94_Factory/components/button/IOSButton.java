package aa90_DesignPatterns.Creational.aa94_Factory.components.button;

public class IOSButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicked IOS button");
    }
}
