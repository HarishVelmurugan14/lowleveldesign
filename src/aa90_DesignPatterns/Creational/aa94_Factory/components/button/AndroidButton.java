package aa90_DesignPatterns.Creational.aa94_Factory.components.button;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicked Android Button");
    }
}
